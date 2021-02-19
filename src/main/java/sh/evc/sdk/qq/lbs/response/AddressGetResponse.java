package sh.evc.sdk.qq.lbs.response;

import sh.evc.sdk.qq.lbs.domain.AddressResult;

/**
 * 地址转坐标
 *
 * @author winixi
 * @date 2020/3/29 8:35 PM
 */
public class AddressGetResponse extends JsonResponse {

  //地址解析结果
  private AddressResult result = new AddressResult();

  public AddressResult getResult() {
    return result;
  }

  public void setResult(AddressResult result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "AddressResponse{" +
            "result=" + result +
            "} " + super.toString();
  }
}
