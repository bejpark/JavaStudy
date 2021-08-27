package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사칙연산프로그램 - 연산자1개, 정수2개
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("연산자를 입력하세요.");
			String x = sc.next();
			//char 로 받으려면 sc.next().charAt(0);
			System.out.println("정수 2개를 입력하세요.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 0;
			switch(x) {
			case "+":result = a+b; break;
			case "-":result=a-b;break;
			case "*":result=a*b;break;
			case "/":result=a/b;break;
			default:{
				System.out.println("+,-,*,/ 중에서만 입력하세요.");
				System.exit(0);
			}
			}
			System.out.println("결과 : "+result);
		}catch(InputMismatchException e) {
			System.out.println("입력 형식 오류");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		

	}

}
