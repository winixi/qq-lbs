package sh.evc.sdk.qq.lbs.api;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.evc.sdk.qq.lbs.api.handler.LbsResponseHandlerTest;
import sh.evc.sdk.qq.lbs.client.LbsClient;
import sh.evc.sdk.qq.lbs.config.LbsConfig;
import sh.evc.sdk.qq.lbs.handler.ResponseHandler;
import sh.evc.sdk.qq.lbs.api.config.LbsConfigTest;

/**
 * 基本测试
 *
 * @author winixi
 * @date 2021/1/8 1:52 PM
 */
public class BaseTest {

  public final static Logger log = LoggerFactory.getLogger(BaseTest.class);
  public LbsClient client;
  public LbsConfig config = new LbsConfigTest();
  public ResponseHandler handler = new LbsResponseHandlerTest();

  @Before
  public void before() {
    client = new LbsClient(config, handler);
  }

}
