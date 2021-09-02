package ex04.io;
import java.io.*;
public class MainEntry {
	
	public static void main(String[] args) {
		InputStream is = System.in; //표준 입력
		
		try {
			System.out.print("단일 문자 입력 요망 : ");
			int num = is.read()-48;
			int num2 = is.read()-48;
			System.out.println(num+num2);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
