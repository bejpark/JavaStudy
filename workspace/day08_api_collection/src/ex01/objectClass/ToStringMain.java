package ex01.objectClass;

class Rectangle{//extends Object
	int x,y;
	
	public Rectangle() {
		x=y=10;
	}
	public void disp() {
		System.out.println(x+", "+y);
	}
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
	
}


public class ToStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.disp();
		System.out.println(rect);
	}

}
