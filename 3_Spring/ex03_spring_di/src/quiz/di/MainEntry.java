package quiz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {

	
	/*
	 * [문제2] 

  - Person interface - 움직인다, 잠을 잔다, 먹는다 는 추상 메소드 구현

  - Student, Worker class 구현 - Person 을 인프리먼츠해서

      - 점수, 이름 등의 변수를 만든다.

      - 이름, 부서, 직급 정도의 변수를 만든다.

      - 이름은 똑같이 받으니깐, 상속의 개념을 넣을 수도 있다.(class A extends B implements C )

  	- 설정파일 2가지 방법으로 만들어보기

       1. xml  ***이 방식은 반드시 구현할 것.

       2. annotation * 이 방식은 구현 할 수 있으면 할 것.
	  */
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Annotation
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Annotationctx.class);
//		Student person = ctx.getBean("student",Student.class);
//		person.print();
//		person.move();
//		person.eat();
//		person.sleep();
//		
//		Worker person2 = ctx.getBean("worker",Worker.class);
//		person2.print();
//		person2.move();
//		person2.eat();
//		person2.sleep();
	
		//bean xml
		String configcontext = "classpath:quiz/di/ctx.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		//bean을 가져온다 - getBean()
		//직접 객체 생성이 아닌 생성되어 있는 객체를 외부에서 얻어옴(주입시켜줬음)
		Student person3 = context.getBean("student", Student.class);
		Worker person4 = context.getBean("worker",Worker.class);
		person3.print();
		person3.move();
		person3.eat();
		person3.sleep();
		
		person4.print();
		person4.move();
		person4.eat();
		person4.setAge(0);
		context.close();
		

	}

}
