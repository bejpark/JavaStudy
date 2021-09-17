package ex02.di;

import java.awt.Point;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ex02/di/ctx.xml");
		ScoreShowImpl show = context.getBean("show",ScoreShowImpl.class);
		show.input();
		show.print();
		
		
		ScoreShowImpl show2 = (ScoreShowImpl)context.getBean("show");
		
		String flag = (show==show2)? "same":"diff";
		
		System.out.println(flag);
		
		Point pt = new Point();
		Point pt2 = new Point();
		
		flag = (pt==pt2)? "same":"diff";
		System.out.println(flag);
		
		ScoreShow show3 = context.getBean("show",ScoreShowImpl.class);
				
		show3.input();
		show3.print();
	}

}
