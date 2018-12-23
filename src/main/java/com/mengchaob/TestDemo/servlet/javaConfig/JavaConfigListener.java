package com.mengchaob.TestDemo.servlet.javaConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Auther: mengchao
 * @Date: 2018-12-23 16:09
 * @Description:
 * @Version 1.0
 * @ClassName JavaConfigListener
 * 	<listener>
 * 		<listener-class>com.mengchaob.TestDemo.servlet.base.JavaConfigListener
 * 		</listener-class>
 * 	</listener>
 */
public class JavaConfigListener implements ServletContextListener {
    //初始化
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("JavaConfigListener 初始化。。。。。");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("JavaConfigListener 销毁。。。。。");
    }
}
