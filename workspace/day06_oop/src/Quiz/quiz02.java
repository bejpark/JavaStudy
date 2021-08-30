package Quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

//성적처리 클래스 구현
class Grade{
	private String name;
	private int sub1,sub2,sub3,total;
	private double avg;
	private char score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.sub1+this.sub2+this.sub3;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (double)this.total/3;
	}
	public char getScore() {
		return score;
	}
	public void setScore() {
		if(avg>=90)
			this.score='A';
		else if(avg>=80)
			this.score='B';
		else if(avg>=70)
			this.score='C';
		else if(avg>=60)
			this.score='D';
		else
			this.score='F';
	}
	public Grade(String name, int sub1, int sub2, int sub3, int total, double avg, char score) {
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.avg = avg;
		this.score = score;
	}
	public Grade() {
		name="이름";
		sub1=0;
		sub2=0;
		sub3=0;
		total=0;
		avg=0;
		score=' ';
	}
	
	public void disp() {
		System.out.println("****** "+this.name+" 학생의 성적표 ******");
		System.out.println("국어 : "+this.sub1+", 전산 : "+this.sub2+", 영어 : "+this.sub3);
		System.out.println("총점 : "+this.total+", 평균 : "+this.avg+", 학점 : "+this.score);
		System.out.println("********************\n");
	}
}

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade grade = new Grade();
		input(grade);
		grade.disp();
	}
	
	public static void input(Grade grade) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***학생 정보 입력***");
		try {
			System.out.print("이름을 입력하세요 : ");
			grade.setName(sc.next());
			while(true) {
				System.out.println("국어 점수를 입력해주세요 (0~100) : ");
				grade.setSub1(sc.nextInt());
				int a = grade.getSub1();
				if(a<0||a>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
			while(true) {
				System.out.println("전산 점수를 입력해주세요 (0~100) : ");
				grade.setSub2(sc.nextInt());
				int b = grade.getSub2();
				if(b<0||b>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
			while(true) {
				System.out.println("영어 점수를 입력해주세요 (0~100) : ");
				grade.setSub3(sc.nextInt());
				int c = grade.getSub3();
				if(c<0||c>100)
					System.out.println("점수 범위가 잘못되었습니다.");
				else
					break;
			}
		}catch(InputMismatchException e) {
			System.out.println("입력 형식이 잘못되었습니다.");
			input(grade);
		}
		
		grade.setTotal();
		grade.setAvg();
		grade.setScore();
	}//input end

}
