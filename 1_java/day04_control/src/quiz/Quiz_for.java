package quiz;

import java.util.Scanner;

public class Quiz_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 원하는 단 받아 구구단 출력
		System.out.print("몇 단을 출력할까요 : ");
		int n = new Scanner(System.in).nextInt();
		
		for (int i=1;i<=9;i++) {
			System.out.println(n+" X "+i+" = "+i*n);
		}
		
		
		//2 전체 구구단 출력
		System.out.println("\n\n*** 전체 구구단 출력 ***");
		
		for (int i=1;i<=9;i++) {
			System.out.println("-------- "+i+"단 --------");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
		}

	}

}
