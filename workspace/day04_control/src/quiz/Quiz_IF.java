package quiz;

import java.util.Scanner;

/*
 전산,영어,국어 점수 입력 받아서 평균 60점 이상이고,
 각 과목 과락 40점이하면 과목 불합격
 */

public class Quiz_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c = 0;
		System.out.println("과목 점수를 입력하세요. 순서는 전산-영어-국어 순");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		double average = (double)(a+b+c)/3;
		boolean flag = true;
		
		//if 문 
//		if ((average>=60)&&(a>40)&&(b>40)&&(c>40)) {
//			System.out.println("합격입니다.");
//		}
//		else
//			if (average<60)
//				System.out.println("평균 점수 불합격입니다.");
//			if (a<=40)
//				System.out.println("전산 점수 불합격입니다.");
//			if (b<=40)
//				System.out.println("국어 점수 불합격입니다.");
//			if (c<=40)
//				System.out.println("영어 점수 불합격입니다.");

			
		switch(average<60? "avg":"") {
			case "avg":
				System.out.println("평균 점수 불합격입니다.");flag=false;break;
			default:
				switch(a<=40?"a":"") {
					case "a":
						System.out.println("전산 점수 불합격입니다.");flag=false;break;
				}
				switch(b<=40? "b":"") {
					case "b":
						System.out.println("국어 점수 불합격입니다.");flag=false;break;
				}
				switch(c<=40? "c":"") {
					case "c":
						System.out.println("영어 점수 불합격입니다.");flag=false;break;
				}
			}
		if (flag==true)
			System.out.println("합격입니다.");
		}


}
