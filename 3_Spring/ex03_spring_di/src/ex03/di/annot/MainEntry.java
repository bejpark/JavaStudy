package ex03.di.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
//		
//		Cats catsInfo = ctx.getBean("catsInfo", Cats.class);
//		catsInfo.catsInfoPrint();
//		MyCats cat2 = ctx.getBean("cat2",MyCats.class);
//		catsInfo.setMyCats(cat2);
//		catsInfo.catsInfoPrint();
//		
		
		
		
		//org.springframework.context.ApplicationContext appctx = new ClassPathXmlApplicationContext("ex03/di/annot/appContext.xml");
		String configcontext = "classpath:ex03/di/annot/appContext.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configcontext);
		//bean을 가져온다 - getBean()
		//직접 객체 생성이 아닌 생성되어 있는 객체를 외부에서 얻어옴(주입시켜줬음)
		MyCats myCats = context.getBean("cat3", MyCats.class);
		Cats cats = context.getBean("cats",Cats.class);
		cats.setMyCats(myCats);
		cats.catsInfoPrint();
		context.close();
		
	}
	

}
