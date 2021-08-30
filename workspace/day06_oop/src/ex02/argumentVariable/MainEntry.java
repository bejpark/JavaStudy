package ex02.argumentVariable;

public class MainEntry {
//가변 길이 배열, 자료형 일치해야함 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus(1,2);
		plus(3);
		plus(10,22,3,4,5,6,7,9);
		plus("33","kbs","mbc","sbs");
		
		System.out.println(plus2("a","b","c"));
	}
	
	private static void plus(String...str) {
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]);
		System.out.println();
	// TODO Auto-generated method stub
	
}

	public static void plus(int...x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
			//System.out.print(sum+" ");
		}
		System.out.println("sum = "+sum);
	}
	
	
	public static String plus2(String...x) {
		String sum = "";
		for(int i=0;i<x.length;i++)
			sum+=x[i]+" ";
		return sum;
		
	}

}
