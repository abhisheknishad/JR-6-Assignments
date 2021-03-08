package empmgtusingspring2nd.com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeMain project= new EmployeeMain();
		project.start();
	}
	void start() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		Canvas canvas=context.getBean("canvas",Canvas.class);
		Employee employee=canvas.getEmployee();
		canvas.display(employee);
		context.close();
	}

}
