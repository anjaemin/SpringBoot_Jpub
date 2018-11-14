package info.thecodinglive;

import info.thecodinglive.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "info.thecodinglive.service", basePackageClasses = HelloService.class)
public class UseCustomStarterApp {
    public static void main(String[] args) {
        SpringApplication.run(UseCustomStarterApp.class, args).getBean(HelloService.class).hi();
    }
}
