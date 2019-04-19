package com.fei.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Author: fengzf fengzf@gstarcad.com
 * @MethodName: 自定义过滤器2
 * @@Description: 
 * @params  
 * @return 
 * @Date:  2019/4/19 16:22
 */  
@Configuration
public class WebConfiguration {
    @Bean
    public FilterRegistrationBean testFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.setName("MyFilter");
        //order 的值越低会先被执行
        registration.setOrder(6);
        return registration;
    }

    @Bean
    public FilterRegistrationBean test2FilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter2());
        registration.addUrlPatterns("/*");
        registration.setName("MyFilter2");
        //order 的值越低会先被执行
        registration.setOrder(1);
        return registration;
    }
}