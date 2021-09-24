package quiz.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	public Object arround(ProceedingJoinPoint point) throws Throwable {
		String str1 = "실행 전";
		String str2 = "실행 후";
		System.out.println(str1);
		Object obj = point.proceed();
		System.out.println(str2);

		return obj;
	}

}
