package com.mengchaob.TestDemo.servlet.javaConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

/**
 * @Auther: mengchao
 * @Date: 2018-12-23 16:54
 * @Description:
 * @Version 1.0
 * @ClassName StartApp2
 */
@SpringBootApplication
public class StartApp2 {
    public static void main(String[] args) {
        SpringApplication.run(StartApp2.class, args);
    }
    @Bean
    public FilterRegistrationBean getfilterRegistrationBean(){
        FilterRegistrationBean frb = new FilterRegistrationBean(new JavaConfigFilter());
        frb.addUrlPatterns(new String[]{"/JavaConfigServlet","*.do"});
        return frb;
    }
    @Bean
    public  ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean srb =  new ServletRegistrationBean(new JavaConfigServlet());
        srb.addUrlMappings("/JavaConfigServlet");
        return srb;
    }

    @Bean
    public ServletListenerRegistrationBean<JavaConfigListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<JavaConfigListener> slrb =  new ServletListenerRegistrationBean<JavaConfigListener>(new JavaConfigListener());
        return slrb;
    }
}
