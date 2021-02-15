package sh.evc.sdk.weather.open.domain;

/**
 * 行政区划信息
 *
 * @author winixi
 * @date 2020/3/29 8:55 PM
 */
public class AdInfo {

  private String nationCode;
  private String adCode;
  private String name;
  private Location location;
  private String nation;

  /**
   * 需要保存，所以确保不为null
   */
  private String province = "";
  private String city = "";
  private String district = "";

  public String getNationCode() {
    return nationCode;
  }

  public void setNationCode(String nationCode) {
    this.nationCode = nationCode;
  }

  public String getAdCode() {
    return adCode;
  }

  public void setAdCode(String adCode) {
    this.adCode = adCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  @Override
  public String toString() {
    return "AdInfo{" +
            "nationCode='" + nationCode + '\'' +
            ", adCode='" + adCode + '\'' +
            ", name='" + name + '\'' +
            ", location=" + location +
            ", nation='" + nation + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", district='" + district + '\'' +
            '}';
  }
}
