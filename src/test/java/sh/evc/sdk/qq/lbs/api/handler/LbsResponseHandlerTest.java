package sh.evc.sdk.qq.lbs.api.handler;

import sh.evc.sdk.qq.lbs.handler.ResponseHandler;
import sh.evc.sdk.qq.lbs.response.ApiResponse;

/**
 * test response handler
 *
 * @author winixi
 * @date 2021/1/8 1:52 PM
 */
public class LbsResponseHandlerTest implements ResponseHandler {

  @Override
  public void append(ApiResponse response) {
    System.out.println(response.toString());
  }
}
