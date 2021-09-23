package ex02.java.oop;

import java.lang.reflect.Proxy;

public class MainEntry {

	public static void main(String[] args) {
		Calc c = new Calcimpl();
		
		Calc proxy = (Calc)Proxy.newProxyInstance(
				c.getClass().getClassLoader() //loader:클래스 찾기
				, c.getClass().getInterfaces()//interfaces:행위(함수)
				, new LogPringHandlerImpl(c)); //h:보조업무를 구현한 클래스
				

		System.out.println(c.add(1, 2));
		
		
		System.out.println(proxy.add(3, 5));
		System.out.println(proxy.mul(3, 5));
	}

}
