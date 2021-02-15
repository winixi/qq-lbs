package sh.evc.sdk.weather.open.api;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.weather.open.api.config.TestConfig;
import sh.evc.sdk.weather.open.api.handler.TestResponseHandler;
import sh.evc.sdk.weather.open.client.LbsClient;
import sh.evc.sdk.weather.open.config.LbsConfig;
import sh.evc.sdk.weather.open.handler.ResponseHandler;

/**
 * 基本测试
 *
 * @author winixi
 * @date 2021/1/8 1:52 PM
 */
public class BaseTest {

  public final static Logger log = LoggerFactory.getLogger(BaseTest.class);
  public LbsClient client;
  public LbsConfig config = new TestConfig();
  public ResponseHandler handler = new TestResponseHandler();

  @Before
  public void before() {
    client = new LbsClient(config, handler);
  }

}
