package ex05.utilPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.print(c.get(Calendar.YEAR)+"년");
		System.out.print(c.get((Calendar.MONTH)+1)+"월");
		
		System.out.println("\n=========");
		Date date = new Date();
		int h = date.getHours(); //권장하지 않아서 deprecated..
		System.out.print(h);

		
		StringTokenizer st = new StringTokenizer("this is a test");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}


	}

}
