
package ex04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) throws Exception{//예외처리 위임 ->Java VM이 처리해줌 
		
		System.out.print("x,y integer data input: ");
		
		int x, y, result = 0;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		result = x / y;
		System.out.println(result); //ctrl+shift+f 자동정렬 
	
	}

}


//package ex04.exception;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class MainEntry {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//		System.out.print("x,y integer data input: ");
//		
//		int x, y, result = 0;
//		x = new Scanner(System.in).nextInt();
//		y = new Scanner(System.in).nextInt();
//		result = x / y;
//		System.out.println(result); //ctrl+shift+f 자동정렬 
//		}catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}catch(InputMismatchException e) {
//			System.out.println("inputmismatch");
//		}catch(Exception e) {
//			System.out.println("Exception");
//			e.printStackTrace();
//		}finally {
//			System.out.println("해당 코드는 무조건 실행됨");
//		}
//		
//	}
//
//}


//package ex04.exception;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class MainEntry {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//		System.out.print("x,y integer data input: ");
//
//		int x, y, result = 0;
//		x = new Scanner(System.in).nextInt();
//		y = new Scanner(System.in).nextInt();
//		result = x / y;
//		System.out.println(result); //ctrl+shift+f 자동정렬 
//		}catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}catch(InputMismatchException e) {
//			System.out.println("inputmismatch");
//		}catch(Exception e) {
//			System.out.println("Exception");
//			e.printStackTrace();
//		}
//		
//	}
//
//}
