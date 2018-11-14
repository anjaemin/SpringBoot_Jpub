package info.thecodinglive.importSelect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {
    @Bean
    MyBean myBean() {
        System.out.println("AConfig create!!");
        return new MyBean("from Aconfig");
    }
}
