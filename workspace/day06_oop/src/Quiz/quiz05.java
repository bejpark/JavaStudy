package Quiz;

import java.util.Random;

/*
문제2] 로또 프로그램 작성 : 

1 ~ 45 숫자 중에서 6개 추출 (단, 같은수 없어야함)
 */
public class quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] lotto = new int[6];
		System.out.println("**** 로또 번호 생성하기 ****");
		for(int i=0;i<6;i++) {
			lotto[i]=rand.nextInt(40)+1;
			System.out.println(lotto[i]+" 을 생성하였습니다.");
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("***중복되는 수가 발견되었습니다. 수를 다시 생성합니다.");
					i--;
					break;
				}		
			}
		}
		System.out.println("** 생성된 로또 번호 **");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
	}

}