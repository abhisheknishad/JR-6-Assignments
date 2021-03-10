package com.cg.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeMain project= new EmployeeMain();
		project.start();
	}
	void start() {
		ConfigurableApplicationContext context = SpringApplication.run(EmployeeMain.class);
        Canvas canvas = context.getBean(Canvas.class);
		Employee employee=canvas.getEmployee();
		canvas.display(employee);
		context.close();
	}

}
