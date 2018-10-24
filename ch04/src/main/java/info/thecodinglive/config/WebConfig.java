package info.thecodinglive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import info.thecodinglive.ExecuteTimeInterceptor;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")       // http://localhost:8080/assets 와 같은 호출경로를 설정
                .addResourceLocations("classpath:/assets/", "assets")  // 실제로 파일이 위치할 경로 설정
                .setCachePeriod(60*60*24*365)                           // 1year 캐시만료일
                .resourceChain(true)                    // 추가설정을 적용하기 위해 true 설정
                .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));       // 웹 리소스 versioning
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }

    @Bean
    public ExecuteTimeInterceptor executeTimeInterceptor() {
        return new ExecuteTimeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(executeTimeInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/");
    }
}
