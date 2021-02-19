package sh.evc.sdk.qq.lbs.api;

import org.junit.Test;
import sh.evc.sdk.qq.lbs.request.AddressGetRequest;
import sh.evc.sdk.qq.lbs.request.LocationGetRequest;
import sh.evc.sdk.qq.lbs.response.AddressGetResponse;
import sh.evc.sdk.qq.lbs.util.JsonFormat;
import sh.evc.sdk.qq.lbs.response.LocationGetResponse;

/**
 * 测试
 *
 * @author winixi
 * @date 2021/2/15 12:54 PM
 */
public class LbsClientTest extends BaseTest {

  private String address = "合肥市瑶海区沱河路与萧城路交口";
  private String lat = "31.104275188953306";
  private String lon = "121.376600481115";

  /**
   * 地址
   */
  @Test
  public void address() {
    AddressGetRequest request = new AddressGetRequest(address);
    AddressGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 位置
   */
  @Test
  public void forecast() {
    LocationGetRequest request = new LocationGetRequest(lat, lon);
    LocationGetResponse response = client.execute(request);
    JsonFormat.print(response);
  }
}
