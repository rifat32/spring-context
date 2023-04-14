package com.example.springcontext;

import com.example.springcontext.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringContextApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringContextApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);
		System.out.println("I am tin main method");
		System.out.println(controller.sayHello());
	}

}
