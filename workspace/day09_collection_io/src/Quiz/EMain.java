package Quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class EMain {
/*
문제2] employee.txt ( file 이용 )

이름, 직급, 부서 입력해서 저장하기
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=1;
		

		try 
		{
			OutputStream os = new FileOutputStream("employee.txt");
			
			while(true) {
				System.out.println("직원"+i+"에 대한 정보 입력");
				System.out.println("이름 : ");
				String name = sc.nextLine();

				System.out.println("직급 : ");
				String rank = sc.nextLine();
				System.out.println("부서 : ");
				String dep = sc.nextLine();
				EClass emp = new EClass(name,rank,dep);
				os.write(emp.toString().getBytes()); 
				System.out.println("저장되었습니다. 추가입력하시겠습니까 : (n : 종료 / 아무키 : 계속)");
				if( sc.nextLine().toUpperCase().equals("N")) break;


			} //end while
			
			System.out.println("employee.txt save success!!!");
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
