package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class MainEntry02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Grade> grade = new Vector<Grade>();
		boolean flag = true;
		while(flag) {
			input(grade);
			System.out.println("더 입력하시려면 아무키나 눌러주세요.(n 입력 시 종료)");
			if(new Scanner(System.in).next().equals("n")) {
				System.out.println("입력 종료");
				flag=false;
			}
		}
		System.out.println("학생 정보 출력");
		for(int i=0;i<grade.size();i++) 
			System.out.println(grade.get(i));
	}
	
	public static void input(Vector grade) {
		int sub1 = 0,sub2=0,sub3=0;
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("***학생 정보 입력***");
		try {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			while(true) {
				System.out.print("국어 점수를 입력해주세요 (0~100) : ");
				sub1 = sc.nextInt();
				if(sub1<0||sub1>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
			while(true) {
				System.out.print("전산 점수를 입력해주세요 (0~100) : ");
				sub2 = sc.nextInt();
				if(sub2<0||sub2>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
			while(true) {
				System.out.print("영어 점수를 입력해주세요 (0~100) : ");
				sub3 = sc.nextInt();
				if(sub3<0||sub3>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
		}catch(InputMismatchException e) {
			System.out.println("입력 형식이 잘못되었습니다.");
			input(grade);
		}
		grade.add(new Grade(sub1,sub2,sub3,name));
	}//input end
	

}
