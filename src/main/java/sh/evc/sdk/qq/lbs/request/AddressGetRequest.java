package sh.evc.sdk.qq.lbs.request;

import sh.evc.sdk.qq.lbs.dict.RequestMethod;
import sh.evc.sdk.qq.lbs.response.AddressGetResponse;
import sh.evc.sdk.qq.lbs.util.ParamsMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 地址请求
 *
 * @author winixi
 * @date 2021/2/15 6:08 PM
 */
public class AddressGetRequest extends ApiRequest<AddressGetResponse> {

  /**
   * 地址
   */
  private String address;

  /**
   * 构造
   *
   * @param address
   */
  public AddressGetRequest(String address) {
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
  public Class<AddressGetResponse> getResponseClass() {
    return AddressGetResponse.class;
  }
}
