package Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * 문제1] 업/다운 게임 프로그램 작성 (난수 이용)
1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.
그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
 */
public class quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int num;
		int target = rand.nextInt(100);
		System.out.println(target);
		boolean flag=false;
		
		System.out.print("** 0~100 사이 수 맞추기 **");

		for(int i=0;i<5;i++) {
			System.out.print("수를 입력하세요 (기회 "+(5-i)+"회 남음) : ");
			num = sc.nextInt();
			if(num==target){
				flag=true;
				break;
			}
			else if(num>target)
				System.out.println("DOWN!!! 입력한 수가 Target보다 큽니다.");
			else//(num<target)
				System.out.println("UP!!! 입력한 수가 Target보다 작습니다.");
		}
		
		if (flag) 
			System.out.println("정답입니다! Target : "+target);
		else 
			System.out.println("맞추지 못했습니다.. Target : \"+target");
	}

}