package ex04.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("ex04/spring/di/appCtx.xml"); 

		ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml"); //bean생성 설정 파일 경로와 파일명 지정한
		
		//interface 타입으로 설정 가능 
		IRecordView view = (IRecordViewImpl)context.getBean("view"); //getBean(bean 네임)메소드로 객체 가져온다.
//		IRecordView view = context.getBean("view",IRecordViewImpl.class); //getBean(bean 네임)메소드로 객체 가져온다.
		view.input();

		view.print();
	}

}
