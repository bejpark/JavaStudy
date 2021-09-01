package ex04.stringBuffer;

public class StringBufferEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		sb.append(" is pencil"); //추가
		System.out.println(sb);
		
		sb.insert(7, "my"); //삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); //교체
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);

	}

}
