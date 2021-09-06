package ex05.Interface;

interface A{//interface - abstract method, final field만 갖는다.
	int x=99;
	final int y=77;
	char ch='A';
	
	public void show(); //public abstract void show();
	public abstract void disp();
	
}//A end

interface B{
	void bView();
}

interface C{
	String name = "happy";
	public void cDraw();
}

interface D extends B{
	void dView();
}

class Rect implements D{

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dView() {
		// TODO Auto-generated method stub

	}
	
	public int plus(int x,int y) {
		return x+y;
	}	
	
}
//interface 간에 상속에서도 extends키워드 사용한다.
class Shape{
	
}

class Multi extends Shape implements B,C,A{

	@Override
	public void show() {
		System.out.println(x);
		//x=9; //값 변경 금지 
		// TODO Auto-generated method stub
	}

	@Override
	public void disp() {
		System.out.println("A interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cDraw() {
		System.out.println("C interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		System.out.println("B interface");
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m = new Multi();
		m.bView();
		m.cDraw();
		m.disp();
		
		B b = new Multi();
		b.bView();
		A a = new Multi();
		a.disp();
		

	}

}
