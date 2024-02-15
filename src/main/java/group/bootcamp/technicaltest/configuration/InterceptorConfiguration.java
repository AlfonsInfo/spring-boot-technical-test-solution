package group.bootcamp.technicaltest.configuration;


import group.bootcamp.technicaltest.utils.security.SimpleApiKeyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{

    @Autowired
    private SimpleApiKeyInterceptor apiKeyInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(apiKeyInterceptor)
                .excludePathPatterns("/swagger-ui/**")
                .excludePathPatterns("/v1/docs/**")
                .excludePathPatterns("/actuator/**");
    }

}
