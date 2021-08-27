package ex07.main;

import java.util.Scanner;

public class WhileCharSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = ' ';
		String str= null;
		int count=0;
		
		System.out.println("아무 값이나 입력하세여. !누르면 탈출 : ");
		
		int n = 10;
		while(true) {
			str = sc.next();
			ch = str.charAt(0);
			if (ch=='!')break;
			count++;
		}//while end
		
		System.out.println("총 입력 받은 문자열 수는 : "+count+"개");
		
		
		do {
			System.out.println("\n score(0-100) : ");
			n = sc.nextInt();
		}while(n<0||n>100);
		System.out.println(n);

	}

}
