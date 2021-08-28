package quiz;

import java.util.Scanner;

public class Quiz09 {
//loopline(){ 6번 출력하는 함수}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("출력할 라인 수를 입력하세요");
		loopline(new Scanner(System.in).nextInt());

	}
	public static void loopline(int n) {
		for (int i=0;i<n;i++)
			System.out.println("------------------------------");
	}
}
