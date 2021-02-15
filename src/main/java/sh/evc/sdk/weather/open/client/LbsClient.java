package sh.evc.sdk.weather.open.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.weather.open.Const;
import sh.evc.sdk.weather.open.config.LbsConfig;
import sh.evc.sdk.weather.open.dict.RequestMethod;
import sh.evc.sdk.weather.open.dict.ResponseType;
import sh.evc.sdk.weather.open.handler.ResponseHandler;
import sh.evc.sdk.weather.open.request.ApiRequest;
import sh.evc.sdk.weather.open.response.ApiResponse;
import sh.evc.sdk.weather.open.response.JsonResponse;
import sh.evc.sdk.weather.open.util.ParamsMap;
import sh.evc.sdk.weather.open.util.SerializeUtil;
import sh.evc.sdk.weather.open.util.httpclient.HttpClient;

import java.io.File;
import java.util.Date;
import java.util.Map;

/**
 * 客户端
 *
 * @author winixi
 * @date 2021/2/9 2:00 PM
 */
public class LbsClient {

  private final static Logger logger = LoggerFactory.getLogger(LbsClient.class);
  private final LbsConfig config;
  private final ResponseHandler handler;
  private final HttpClient client = new HttpClient();

  public LbsClient(LbsConfig config, ResponseHandler handler) {
    this.config = config;
    this.handler = handler;
  }

  /**
   * 执行请求
   *
   * @param request
   * @param <T>
   * @return
   */
  public <T extends ApiResponse> T execute(ApiRequest<T> request) {
    RequestMethod method = request.getMethod();
    Map<String, String> basicParams = request.getBasicParams();
    basicParams.put("key", config.getKey());
    String url = Const.SERVER_URL + request.getUri();
    String entityData = getEntityData(request.getEntityParams());
    Date requestTime = new Date();
    File file = request.getFile();
    ResponseType responseType = request.getResponseType();
    T response;
    if (responseType == ResponseType.BUFFER) {
      byte[] buffer = requestBuffer(method, url, basicParams, entityData);
      response = (T) new JsonResponse();
      response.setResponseBuffer(buffer);
    } else {
      String res = requestString(method, url, basicParams, entityData, file);
      response = SerializeUtil.jsonToBean(res, request.getResponseClass());
      response.setResponseBody(res);
    }
    response.setReqUrl(url);
    response.setBasicParams(basicParams);
    response.setEntityData(entityData);
    response.setMethod(request.getMethod());
    response.setRequestTime(requestTime);
    response.setResponseTime(new Date());

    handler.append(response);
    return response;
  }

  /**
   * 整理data
   *
   * @param params
   * @return
   */
  private String getEntityData(ParamsMap params) {
    if (params == null || params.isEmpty()) {
      return "";
    }
    return SerializeUtil.beanToJson(params);
  }

  /**
   * 获取二进制流请求
   *
   * @param method
   * @param url
   * @param params
   * @param entityData
   * @return
   */
  private byte[] requestBuffer(RequestMethod method, String url, Map<String, String> params, String entityData) {
    if (method == RequestMethod.POST) {
      return client.postReceiveBuffer(url, params, entityData);
    }
    logger.error("获取二进制流未实现{}", method);
    return null;
  }

  /**
   * 获取字符串请求
   *
   * @param method
   * @param url
   * @param params
   * @param entityData
   * @param file
   * @return
   */
  private String requestString(RequestMethod method, String url, Map<String, String> params, String entityData, File file) {
    if (file != null) {
      return client.upload(url, params, file);
    }

    if (method == RequestMethod.POST) {
      return client.post(url, params, entityData);
    } else {
      return client.get(url, params);
    }
  }
}
