package sh.evc.sdk.weather.open.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 地址解析结果
 *
 * @author winixi
 * @date 2020/3/29 9:26 PM
 */
public class AddressResult {

  private String title;

  /**
   * 解析到的坐标
   */
  private Location location = new Location();

  @JsonProperty("address_components")
  private AddressComponent addressComponent = new AddressComponent();

  /**
   * 行政区划信息
   */
  private AdInfo adInfo;

  /**
   * 可信度参考：值范围 1 <低可信> - 10 <高可信>
   * 我们根据用户输入地址的准确程度，在解析过程中，将解析结果的可信度(质量)，由低到高，分为1 - 10级，该值>=7时，解析结果较为准确，<7时，会存各类不可靠因素，开发者可根据自己的实际使用场景，对于解析质量的实际要求，进行参考。
   */
  private Integer reliability;

  /**
   * 值	解析级别
   * 1	城市
   * 2	区、县
   * 3	乡镇、街道
   * 4	村、社区
   * 5	开发区
   * 6	热点区域、商圈
   * 7	道路
   * 8	道路附属点：交叉口、收费站、出入口等
   * 9	门址
   * 10	小区、大厦
   * 11	POI点
   * 解析精度级别，分为11个级别，一般>=9即可采用（定位到点，精度较高） 也可根据实际业务需求自行调整，完整取值表见下文。
   */
  private Integer level;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public AddressComponent getAddressComponent() {
    return addressComponent;
  }

  public void setAddressComponent(AddressComponent addressComponent) {
    this.addressComponent = addressComponent;
  }

  public AdInfo getAdInfo() {
    return adInfo;
  }

  public void setAdInfo(AdInfo adInfo) {
    this.adInfo = adInfo;
  }

  public Integer getReliability() {
    return reliability;
  }

  public void setReliability(Integer reliability) {
    this.reliability = reliability;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "AddressResult{" +
            "title='" + title + '\'' +
            ", location=" + location +
            ", addressComponent=" + addressComponent +
            ", adInfo=" + adInfo +
            ", reliability=" + reliability +
            ", level=" + level +
            '}';
  }
}
