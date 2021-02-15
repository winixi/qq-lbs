package sh.evc.sdk.weather.open.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 区域
 *
 * @author winixi
 * @date 2020/3/29 8:45 PM
 */
public class Area {

  private String id;    //地点唯一标示
  private String title; //名称/标题
  private Location location;  //坐标

  @JsonProperty("_distance")
  private Double distance;  //此参考位置到输入坐标的直线距离

  @JsonProperty("_dir_desc")
  private String dirDesc;   //此参考位置到输入坐标的方位关系，如：北、南、内

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public String getDirDesc() {
    return dirDesc;
  }

  public void setDirDesc(String dirDesc) {
    this.dirDesc = dirDesc;
  }

  @Override
  public String toString() {
    return "Area{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", location=" + location +
            ", distance=" + distance +
            ", dirDesc='" + dirDesc + '\'' +
            '}';
  }
}
