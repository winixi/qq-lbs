package sh.evc.sdk.qq.lbs.domain;

/**
 * 坐标相对位置参考
 *
 * @author winixi
 * @date 2020/3/29 8:58 PM
 */
public class AddressReference {

  /**
   * 知名区域，如商圈或人们普遍认为有较高知名度的区域
   */
  private Area famousArea;

  /**
   * 乡镇街道
   */
  private Area town;

  /**
   * 一级地标，可识别性较强、规模较大的地点、小区等
   */
  private Area landmarkL1;

  /**
   * 二级地标，较一级地标更为精确，规模更小
   */
  private Area landmarkL2;

  /**
   * 街道
   */
  private Area street;

  /**
   * 门牌
   */
  private Area streetNumber;

  /**
   * 交叉路口
   */
  private Area crossroad;

  public Area getFamousArea() {
    return famousArea;
  }

  public void setFamousArea(Area famousArea) {
    this.famousArea = famousArea;
  }

  public Area getTown() {
    return town;
  }

  public void setTown(Area town) {
    this.town = town;
  }

  public Area getLandmarkL1() {
    return landmarkL1;
  }

  public void setLandmarkL1(Area landmarkL1) {
    this.landmarkL1 = landmarkL1;
  }

  public Area getLandmarkL2() {
    return landmarkL2;
  }

  public void setLandmarkL2(Area landmarkL2) {
    this.landmarkL2 = landmarkL2;
  }

  public Area getStreet() {
    return street;
  }

  public void setStreet(Area street) {
    this.street = street;
  }

  public Area getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(Area streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Area getCrossroad() {
    return crossroad;
  }

  public void setCrossroad(Area crossroad) {
    this.crossroad = crossroad;
  }

  @Override
  public String toString() {
    return "AddressReference{" +
            "famousArea=" + famousArea +
            ", town=" + town +
            ", landmarkL1=" + landmarkL1 +
            ", landmarkL2=" + landmarkL2 +
            ", street=" + street +
            ", streetNumber=" + streetNumber +
            ", crossroad=" + crossroad +
            '}';
  }
}
