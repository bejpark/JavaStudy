package ex03.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPringHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invoke method start");
		
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");

		
		Object result = invocation.proceed();
		
		log.info("[타이머 정지]");
		sw.stop();
		log.info("[Time log] method : "+invocation.getMethod());
		log.info("[Time log] Process Time : "+sw.getTotalTimeMillis());
		
		return result;
	}

}
