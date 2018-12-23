package com.mengchaob.TestDemo.servlet.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //在 springBoot 启动时会扫描@WebServlet，并将该类实例化
public class StartApp1 {

	public static void main(String[] args) {
		SpringApplication.run(StartApp1.class, args);
	}

}

