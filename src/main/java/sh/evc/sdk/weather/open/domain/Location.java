package sh.evc.sdk.weather.open.domain;

/**
 * 坐标
 *
 * @author winixi
 * @date 2020/3/29 8:41 PM
 */
public class Location {

  private Double lat = 0d;
  private Double lng = 0d;

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }

  @Override
  public String toString() {
    return "Location{" +
            "lat=" + lat +
            ", lng=" + lng +
            '}';
  }
}
