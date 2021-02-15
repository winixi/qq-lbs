package sh.evc.sdk.weather.open.domain;

/**
 * 逆地址解析结果
 *
 * @author winixi
 * @date 2020/3/29 8:53 PM
 */
public class LocationResult {

  /**
   * 地址描述
   */
  private String address;

  /**
   * 位置描述
   */
  private FormattedAddress formattedAddresses = new FormattedAddress();

  /**
   * 地址部件，address不满足需求时可自行拼接
   */
  private AddressComponent addressComponent = new AddressComponent();

  /**
   * 行政区划信息
   */
  private AdInfo adInfo = new AdInfo();

  /**
   * 坐标相对位置参考
   */
  private AddressReference addressReference = new AddressReference();

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public FormattedAddress getFormattedAddresses() {
    return formattedAddresses;
  }

  public void setFormattedAddresses(FormattedAddress formattedAddresses) {
    this.formattedAddresses = formattedAddresses;
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

  public AddressReference getAddressReference() {
    return addressReference;
  }

  public void setAddressReference(AddressReference addressReference) {
    this.addressReference = addressReference;
  }

  @Override
  public String toString() {
    return "LocationResult{" +
            "address='" + address + '\'' +
            ", formattedAddresses=" + formattedAddresses +
            ", addressComponent=" + addressComponent +
            ", adInfo=" + adInfo +
            ", addressReference=" + addressReference +
            '}';
  }
}
