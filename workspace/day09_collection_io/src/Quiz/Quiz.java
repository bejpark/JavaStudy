package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		char key=' ';
		System.out.println("** 사칙연산 프로그램 **");
		System.out.print("수 1을 입력하세요 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("수 2를 입력하세요 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산을 선택하세요 (+,-,*,/) : ");
		key = (char) br.read();
	
		switch(key) {
		case '+':System.out.println("결과 :"+(a+b));break;
		case '-':System.out.println("결과 :"+(a-b));break;
		case '*':System.out.println("결과 :"+(a*b));break;
		case '/':System.out.println("결과 :"+(double)(a/b));break;
		default:
			System.out.println("연산자를 잘못 입력했습니다.");
			break;
		}

	}

}
