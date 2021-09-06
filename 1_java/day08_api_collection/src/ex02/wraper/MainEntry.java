package ex02.wraper;

class Point{
	
}
public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iA = new Integer(10);
		Integer iB = new Integer("1");
		String su = "10";
		System.out.println(iB);
		
		Point pt = new Point();
		System.out.println(iA.MAX_VALUE);
		System.out.println(pt);
		System.out.println(pt.toString());

		System.out.println(iA.getClass().getName()+'@'+Integer.toHexString(pt.hashCode()));
		System.out.println(iA);
		
		
		//boxing vs unboxing
		int c = iA.intValue();
		int d = iB; //unboxing, jdk5.x 이후
		int num = Integer.parseInt(su);
		System.out.println(num);
	}

}
