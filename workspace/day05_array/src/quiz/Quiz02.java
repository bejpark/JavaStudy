package quiz;

import java.util.Scanner;

public class Quiz02 {
//9월의 강수량 평균을 구하는 프로그램 작성 (30일 기준)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] rain = new float[5];
		System.out.println("강수량 입력 : ");
		for(int i=0;i<rain.length;i++)
			rain[i] = new Scanner(System.in).nextFloat();
			
		float avg = 0;
		for(int i=0;i<rain.length;i++)
			avg+=rain[i];
		avg = avg/rain.length;
		System.out.println("강수량 평균 : "+avg);
			

	}

}
