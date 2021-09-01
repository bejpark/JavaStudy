package ex03.string;

public class StringAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//같은 문자 같은 주소로 
		s1="aa";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s2="aa";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s2="korea";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String msg = "ccccc";
		msg = msg+"ddd";
		msg = msg.concat(" dd");
		System.out.println(msg);
		
		String s3 = "abcdef".substring(2,3);
		System.out.println(s3);
		
		String s4 = new String("werwer/werf/ssdf/ss");
		String[] s5 = s4.split("/");
		for(int i=0;i<s5.length;i++) {
			System.out.println(s5[i]);
		}
	}

}
