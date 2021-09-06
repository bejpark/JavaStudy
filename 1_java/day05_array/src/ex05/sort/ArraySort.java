package ex05.sort;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,3,5,2,8};
		int temp;
		
		System.out.println("**** 소트 전 출력 : ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		
		System.out.println("\n 오름차순 정렬됨 ");
		Arrays.sort(a);
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}

}
