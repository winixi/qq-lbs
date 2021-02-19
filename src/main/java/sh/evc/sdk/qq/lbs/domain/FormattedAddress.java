package sh.evc.sdk.qq.lbs.domain;

/**
 * 位置描述
 *
 * @author winixi
 * @date 2020/3/29 8:36 PM
 */
public class FormattedAddress {

  /**
   * 经过腾讯地图优化过的描述方式，更具人性化特点
   */
  private String recommend;

  /**
   * 大致位置，可用于对位置的粗略描述
   */
  private String rough;

  public String getRecommend() {
    return recommend;
  }

  public void setRecommend(String recommend) {
    this.recommend = recommend;
  }

  public String getRough() {
    return rough;
  }

  public void setRough(String rough) {
    this.rough = rough;
  }

  @Override
  public String toString() {
    return "FormattedAddress{" +
            "recommend='" + recommend + '\'' +
            ", rough='" + rough + '\'' +
            '}';
  }
}
