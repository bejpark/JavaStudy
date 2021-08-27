package ex03.IF;

import java.util.Scanner;

public class MainIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
		String grade = null;
		char grade2 =' ';
		
		if (score>=90) {
			System.out.println("A");
			grade2='A';
		}
		else if (score>=80) {
			System.out.println("B");
		}
		else if (score>=70) {
			System.out.println("C");
		}
		else if (score>=60) {
			System.out.println("D");
		}
		else
			System.out.println("F");
		
		
		int n;
		
		System.out.println("점수 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		// 아래 동
	}

}
