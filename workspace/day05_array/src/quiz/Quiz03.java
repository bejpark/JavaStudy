package quiz;

import java.util.Scanner;

public class Quiz03 {
 // int[] a = {7,5,7,8,2,7,3,7,7,90}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {7,5,7,8,2,7,3,7,7,90};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("찾고자 하는 수를 입력하세요 : ");
		 int seek = sc.nextInt();
		 int count=0;
		 for(int i =0;i<a.length;i++) {
			 if(a[i]==seek)
				 count++;
		 }
		 System.out.println(seek+" 의 총 개수는 : "+count+"개 입니다.");
	}

}
