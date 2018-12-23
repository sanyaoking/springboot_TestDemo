package com.mengchaob.TestDemo.servlet.javaConfig;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Auther: mengchao
 * @Date: 2018-12-23 16:09
 * @Description:
 * @Version 1.0
 * @ClassName JavaConfigFilter
 * 原始的xmlfliter配置
 * 	<filter>
 * 		<filter-name>JavaConfigFilter</filter-name>
 * 		<filter-class>com.mengchaob.TestDemo.servlet.base.JavaConfigFilter</filter-class>
 * 	</filter>
 * 	<filter-mapping>
 * 		<filter-name>JavaConfigFilter</filter-name>
 * 		<url-pattern>/*.do</url-pattern>
 * 	</filter-mapping>
 *
 */
public class JavaConfigFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入 Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开 Filter");
    }

    public void destroy() {
        System.out.println("Filter destroy");
    }
}
