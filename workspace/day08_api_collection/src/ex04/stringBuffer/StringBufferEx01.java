package ex04.stringBuffer;

public class StringBufferEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println("length    /    capaticy");
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "   /   "+size);
		sb.append("kosa");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+" / "+size);
		sb.append("aaaa");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+" / "+size);
		sb.append("12312 312 31 23");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+" / "+size);
		
		sb.trimToSize(); //용량 맞춤 
		len = sb.length();
		size = sb.capacity();
		System.out.println(len+" / "+size);
		
	}

}
