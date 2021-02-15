package sh.evc.sdk.weather.open.request;

import sh.evc.sdk.weather.open.dict.RequestMethod;
import sh.evc.sdk.weather.open.response.AddressResponse;
import sh.evc.sdk.weather.open.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 地址请求
 *
 * @author winixi
 * @date 2021/2/15 6:08 PM
 */
public class AddressRequest extends ApiRequest<AddressResponse> {

  /**
   * 地址
   */
  private String address;

  /**
   * 构造
   *
   * @param address
   */
  public AddressRequest(String address) {
    this.address = address;
  }

  @Override
  public ParamsMap getEntityParams() {
    return null;
  }

  @Override
  public Map<String, String> getBasicParams() {
    Map<String, String> params = new HashMap<>();
    params.put("address", address);
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
  public Class<AddressResponse> getResponseClass() {
    return AddressResponse.class;
  }
}
