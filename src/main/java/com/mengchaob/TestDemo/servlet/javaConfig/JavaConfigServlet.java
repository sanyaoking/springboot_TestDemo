package com.mengchaob.TestDemo.servlet.javaConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @Auther: mengchao
 * @Date: 2018-12-23 16:08
 * @Description:
 * @Version 1.0
 * @ClassName JavaConfigServlet
 * 	<!-- 预算首页下载start -->
 * 	<servlet>
 * 	    <servlet-name>JavaConfigServlet</servlet-name>
 * 	    <servlet-class>com.mengchaob.TestDemo.servlet.base.JavaConfigServlet</servlet-class>
 * 	</servlet>
 * 	<servlet-mapping>
 * 	    <servlet-name>JavaConfigServlet</servlet-name>
 * 	    <url-pattern>/JavaConfigServlet</url-pattern>
 * 	</servlet-mapping>
 */
public class JavaConfigServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JavaConfigServlet 正在运行 。。。。。。");
        resp.setContentType("text/html;charset=UTF-8");
        Writer writer = resp.getWriter();
        writer.write("JavaConfigServlet 正在运行 。。。。。。");
    }
}
