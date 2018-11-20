package serviceTest;

import info.thecodinglive.config.ServiceConfig;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ServiceConfig.class, loader = AnnotationConfigContextLoader.class)
@Rollback
public class ServiceTestConfig {
    @Test
    public void test() {

    }
}
