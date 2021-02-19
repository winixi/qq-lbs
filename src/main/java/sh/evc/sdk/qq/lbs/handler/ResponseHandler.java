package sh.evc.sdk.qq.lbs.handler;

import sh.evc.sdk.qq.lbs.response.ApiResponse;

/**
 * response handler
 *
 * @author winixi
 * @date 2021/1/18 11:37 AM
 */
public interface ResponseHandler {

  /**
   * 用来做日志或数据记录
   *
   * @param response
   */
  void append(ApiResponse response);
}
