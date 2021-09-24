package ex05.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex05/spring/aop/appCtx.xml");
		
		
		Print s = context.getBean("student",Print.class);
		s.show();
		Print e = context.getBean("employee",Print.class);
		e.show();
	}

}
