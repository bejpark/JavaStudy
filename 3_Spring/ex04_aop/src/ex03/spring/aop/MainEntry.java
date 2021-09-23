package ex03.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		String config = "classpath:ex03/spring/aop/appCtx.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Calc proxy = context.getBean("proxy",Calc.class);
		System.out.println(proxy.add(10, 20, 30));
		System.out.println(proxy.sub(5, 3, 7));
		System.out.println(proxy.mul(2,5));
	}

}
