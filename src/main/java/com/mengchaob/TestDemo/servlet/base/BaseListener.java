package com.mengchaob.TestDemo.servlet.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Auther: mengchao
 * @Date: 2018-12-23 16:09
 * @Description:
 * @Version 1.0
 * @ClassName BaseListener
 * 	<listener>
 * 		<listener-class>com.mengchaob.TestDemo.servlet.base.BaseListener
 * 		</listener-class>
 * 	</listener>
 */
@WebListener
public class BaseListener implements ServletContextListener {
    //初始化
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("BaseListener 初始化。。。。。");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("BaseListener 销毁。。。。。");
    }
}
