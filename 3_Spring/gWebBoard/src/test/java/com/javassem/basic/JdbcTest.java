package com.javassem.basic;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JdbcTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
		단위테스트 : 일반적으로 구축전이나 도중에 구체적인 부분만 확인하기 위해
		통합테스트 : 전반적인 부분을 확인하기 위해
		
		※ 테스트는 어떠한 경우에서라도 서로 의존해서는 안되고, 서로 절대 영향을 줘서도 안됩니다.

		JUnit : 이미 자바에서는 테스팅을 하기 위해 기존 코드와 유사한 코드를 만드는 불편함을 없애기 위한 여러 테스팅 도구들이 존재하고,
				그 중 JUnit은 표준이라 할 정도로 폭넓게 사용되는 자바 테스팅 프레임워크입니다.

		* JUnit 테스트 메서드 규칙(@Test)
		1. 테스트 대상 메서드가 public 으로 선언되어야 합니다.
		2. 메서드에 @Test 라는 어노테이션이 필요합니다.
		3. 반환형은 없고, 매개변수도 없어야 합니다.

	 */
	@Test
	public void testConnection() {
		try {
			Connection con = 
			DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", 
					"scott", "tiger");
			System.out.println("[ 연결성공 ]" + con);
			
			/*
			 * 여기서 잘못된 연결을 할 경우에도 (ex. 계정과 패스워드가 다른 경우 )
			 * 테스트상에서는 성공(녹색)이지만 실제 구동에서는 에러를 발생한다.
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
