package info.thecodinglive.importSelect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoMyModule(value = "someValue")
public class MainConfig {
    @Bean
    public UseMyBean useMyBean() {
        System.out.println("userMyBean() call!!");
        return new UseMyBean();
    }
}
