package ex01.overload;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		line("*");
		line(20,"1");

	}
	
	public static void line(String str) {
		for(int i=0;i<10;i++)
			System.out.print(str);
		System.out.println();
	}

	public static void line() {
		System.out.print("--");
	}
	
	public static void line(int n,String str) {
		for(int i=0;i<n;i++)
			System.out.print(str);
		System.out.println();
	}

}
