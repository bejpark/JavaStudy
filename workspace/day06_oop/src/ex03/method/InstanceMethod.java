package ex03.method;

class B{
	int x,y;
	public void setData(int xx,int yy) {
		System.out.println(xx+", "+yy);
	}
	
}

public class InstanceMethod {

	public static void main(String[] args) {
		B b = new B();
		b.setData(20, 50);
		// TODO Auto-generated method stub

	}

}
