package sh.evc.sdk.weather.open.request;

import sh.evc.sdk.weather.open.dict.RequestMethod;
import sh.evc.sdk.weather.open.response.LocationResponse;
import sh.evc.sdk.weather.open.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 位置请求
 *
 * @author winixi
 * @date 2021/2/15 6:10 PM
 */
public class LocationRequest extends ApiRequest<LocationResponse> {

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
  public LocationRequest(String lat, String lon) {
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
  public Class<LocationResponse> getResponseClass() {
    return LocationResponse.class;
  }
}
