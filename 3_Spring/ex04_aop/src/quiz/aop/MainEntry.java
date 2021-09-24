package quiz.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("quiz/aop/ctx.xml");
		
		Student s = context.getBean("student",Student.class);
		Worker w = context.getBean("worker",Worker.class);
		
		s.show();
		w.show();
	}

}
