package sh.evc.sdk.qq.lbs.request;

import sh.evc.sdk.qq.lbs.dict.RequestMethod;
import sh.evc.sdk.qq.lbs.response.LocationGetResponse;
import sh.evc.sdk.qq.lbs.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 位置请求
 * 输入坐标返回地理位置信息，注意qqlbs需要的是gcj02的参数
 *
 * @author winixi
 * @date 2021/2/15 6:10 PM
 */
public class LocationGetRequest extends ApiRequest<LocationGetResponse> {

  /**
   * 经度
   */
  private String lat;

  /**
   * 纬度
   */
  private String lon;

  /**
   * 构造
   *
   * @param lat
   * @param lon
   */
  public LocationGetRequest(String lat, String lon) {
    this.lat = lat;
    this.lon = lon;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("location", lat + "," + lon);
    return params;
  }

  @Override
  public String getUri() {
    return "/ws/geocoder/v1/";
  }

  @Override
  public RequestMethod getMethod() {
    return RequestMethod.GET;
  }

  @Override
  public Class<LocationGetResponse> getResponseClass() {
    return LocationGetResponse.class;
  }
}
