package sh.evc.sdk.weather.open.api;

import org.junit.Test;
import sh.evc.sdk.weather.open.request.AddressRequest;
import sh.evc.sdk.weather.open.request.LocationRequest;
import sh.evc.sdk.weather.open.response.AddressResponse;
import sh.evc.sdk.weather.open.response.LocationResponse;
import sh.evc.sdk.weather.open.util.JsonFormat;

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
    AddressRequest request = new AddressRequest(address);
    AddressResponse response = client.execute(request);
    JsonFormat.print(response);
  }

  /**
   * 位置
   */
  @Test
  public void forecast() {
    LocationRequest request = new LocationRequest(lat, lon);
    LocationResponse response = client.execute(request);
    JsonFormat.print(response);
  }
}
