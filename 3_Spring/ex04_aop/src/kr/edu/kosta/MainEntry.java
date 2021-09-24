package kr.edu.kosta;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		String config = "kr/edu/kosta/ctx.xml";
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config);
		Student student = ctx.getBean("student",Student.class);
		student.show();
		
		Worker worker = (Worker)ctx.getBean("worker");
		worker.show();
		ctx.close();

	}

}
