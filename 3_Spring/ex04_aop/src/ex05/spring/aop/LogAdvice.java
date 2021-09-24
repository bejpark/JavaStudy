package ex05.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	
	public Object arround(ProceedingJoinPoint point) throws Throwable {
		String str1="실제 실행 구현 전에 호출됩니다.";
		String str2="실행 후에 호출 됩니다.";
		
		System.out.println(str1);
		
		Object obj = point.proceed();
		
		System.out.println(str2);
		
		return obj;
	}

}
