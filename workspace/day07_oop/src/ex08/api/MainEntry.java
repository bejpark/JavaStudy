package ex08.api;


class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : "+pt.getClass());
		System.out.println("hash name : "+pt.hashCode());
		System.out.println("object string : "+pt.toString());
		System.out.println("object string : "+pt);//toString은 생략가능 
		System.out.printf("10진수 %d\n",0x6108b2d7);
		
		System.out.println("pt.toString() : toString()의 의미");
		System.out.println(pt.getClass().getName()+'@'
				+Integer.toHexString(pt.hashCode()));
		
		
		Point pt2 = new Point();
		if(pt.hashCode()==pt2.hashCode()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		Point pt3;
		pt3=pt;
		if (pt.hashCode()==pt3.hashCode()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
