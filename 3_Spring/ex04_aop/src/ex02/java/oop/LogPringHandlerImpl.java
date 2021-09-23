package ex02.java.oop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPringHandlerImpl implements InvocationHandler {

	private Object target;
	
	public LogPringHandlerImpl(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method start~~~~");
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[타이머 시작]");
		//주관심사
		int result = (int)method.invoke(target, args);

		sw.stop();
		log.info("[타이머 정지]");
		log.info("[Time log] method : "+method.getName());
		log.info("[Time log] Process Time : "+sw.getTotalTimeMillis());
		
		return result;
		
	}

}
