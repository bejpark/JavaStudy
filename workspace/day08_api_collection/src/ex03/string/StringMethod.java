package ex03.string;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234590def  32948 wekrlj lkj";
		char ch = s.charAt(8);
		System.out.println(ch);
		String s1 = "dfwWW";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		char[] ch2 = s1.toCharArray();
		for(int i=0;i<s1.length();i++)
			System.out.print(ch2[i]+"\t");
	}

}
