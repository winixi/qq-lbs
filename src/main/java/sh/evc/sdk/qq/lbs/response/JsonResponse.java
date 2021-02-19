package sh.evc.sdk.qq.lbs.response;

/**
 * 基本返回
 *
 * @author winixi
 * @date 2020/3/30 10:22 AM
 */
public class JsonResponse extends ApiResponse {

  /**
   * 状态码，0为正常,
   * 310请求参数信息有误，
   * 311Key格式错误,
   * 306请求有护持信息请检查字符串,
   * 110请求来源未被授权
   */
  private Integer status;

  /**
   * 状态说明
   */
  private String message;

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "JsonResponse{" +
            "status=" + status +
            ", message='" + message + '\'' +
            '}';
  }
}
