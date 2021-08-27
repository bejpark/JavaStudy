package ex02.array2;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열에 임의 데이터 입력받아 값 출력하고 행의 더한 결과 출력
		int[][] b = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		int [] a = new int[2];
		for(int i=0;i<2;i++) {
			a[i] = 0;
			for(int j=0;j<3;j++) {
				System.out.println(i+" 행 "+j+" 열 데이터 입력 : ");
				b[i][j] = sc.nextInt();
				a[i]+= b[i][j];
			}
		}
		System.out.println("전체 행렬 출력 : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("행의 더한 결과 : ");
		for(int i=0;i<2;i++)
			System.out.println(i+" 행의 총 합 : "+a[i]);


	}

}
