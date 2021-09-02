package ex05.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//InputStream is = System.in;
		//Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();//예외발생, 여러개 데이터 입력 받기 
		int su1 = Integer.parseInt(str);
		
		System.out.println(su1+100);
		System.out.println(str+100);
	

	}

}
