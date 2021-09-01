package ex03.string;

public class MainEntry {
	public static void main(String[] args) {
		Integer x = 999;
		String str="abc";
		System.out.println("str: "+str);
		
		char data[]= {'a','b','c'};
		String str1 = new String(data);
		System.out.println(str1);
		System.out.println(x+" "+x.hashCode());
		
		str = "korea";
		System.out.println("str : "+str);
		str = "busan";
		System.out.println("str : "+str);
	}

}
