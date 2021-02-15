package sh.evc.sdk.weather.open.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import sh.evc.sdk.weather.open.domain.LocationResult;

/**
 * 坐标位置信息，逆地址解析
 *
 * @author winixi
 * @date 2020/3/29 8:35 PM
 */
public class LocationResponse extends JsonResponse {

  /**
   * 本次请求的唯一标识
   */
  @JsonProperty("request_id")
  private String requestId;

  /**
   * 逆地址解析结果
   */
  private LocationResult result = new LocationResult();

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public LocationResult getResult() {
    return result;
  }

  public void setResult(LocationResult result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "LocationResponse{" +
            "requestId='" + requestId + '\'' +
            ", result=" + result +
            "} " + super.toString();
  }
}
