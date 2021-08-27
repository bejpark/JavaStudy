package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = new int[5];
//		a[0] = 1;
//		a[1] = 1;
//		a[2] = 1;
//		a[3] = 1;
//		a[4] = 1;
		int[] a = {2,3,4,5,6};
		System.out.println(a[1]);
		
		
		
		int[] b = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			System.out.println((i+1)+"번째 자리 데이터 : ");
			b[i] = sc.nextInt();
			sum +=b[i];
		}
		System.out.println("입력한 배열 출럭--");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println("\n배열 데이터의 총 합 : "+sum);
		
	}

}
