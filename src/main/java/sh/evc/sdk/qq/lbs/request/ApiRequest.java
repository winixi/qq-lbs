package sh.evc.sdk.qq.lbs.request;

import sh.evc.sdk.qq.lbs.dict.RequestMethod;
import sh.evc.sdk.qq.lbs.dict.ResponseType;
import sh.evc.sdk.qq.lbs.util.ParamsMap;
import sh.evc.sdk.qq.lbs.response.ApiResponse;

import java.io.File;
import java.util.Map;

/**
 * api request
 *
 * @author winixi
 * @date 2021/1/18 10:34 AM
 */
public abstract class ApiRequest<T extends ApiResponse> {

  /**
   * 获取请求参数
   *
   * @return
   */
  public abstract ParamsMap getEntityParams();

  /**
   * 获取基本请求参数
   *
   * @return
   */
  public abstract Map<String, String> getBasicParams();

  /**
   * 获取接口地址
   *
   * @return
   */
  public abstract String getUri();

  /**
   * 获取文件
   *
   * @return
   */
  public File getFile() {
    return null;
  }

  /**
   * 获取请求方法
   *
   * @return
   */
  public abstract RequestMethod getMethod();

  /**
   * 获取返回对象类型
   *
   * @return
   */
  public abstract Class<T> getResponseClass();

  /**
   * 返回类型，默认都是字符串
   *
   * @return
   */
  public ResponseType getResponseType() {
    return ResponseType.STRING;
  }
}
