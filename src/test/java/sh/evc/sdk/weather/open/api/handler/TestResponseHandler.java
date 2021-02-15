package sh.evc.sdk.weather.open.api.handler;

import sh.evc.sdk.weather.open.handler.ResponseHandler;
import sh.evc.sdk.weather.open.response.ApiResponse;

/**
 * test response handler
 *
 * @author winixi
 * @date 2021/1/8 1:52 PM
 */
public class TestResponseHandler implements ResponseHandler {

  @Override
  public void append(ApiResponse response) {
    System.out.println(response.toString());
  }
}
