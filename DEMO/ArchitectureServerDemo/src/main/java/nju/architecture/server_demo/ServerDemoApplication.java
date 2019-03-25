package nju.architecture.server_demo;

import nju.architecture.server_demo.api_gateway.RequestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServerDemoApplication {

    @Bean
    public FilterRegistrationBean corsFilterRegistration() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean<>(new RequestFilter());
        registrationBean.setName("CORS Filter");
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerDemoApplication.class, args);
    }

}
