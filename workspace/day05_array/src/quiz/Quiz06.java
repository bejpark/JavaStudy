package quiz;

import java.util.Scanner;

public class Quiz06 {
	//절댓값 출력하는 함수  abs(int x)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 한개 입력 : ");
		int val = new Scanner(System.in).nextInt();
		System.out.println(val+" 의 절댓값은 : "+abs(val));

	}
	
	public static int abs(int x) {
		if (x>=0)
			return x;
		else
			return -x;
	}

}
