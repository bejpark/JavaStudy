package ex08.interitance;

class Point{
	protected int x,y; //private 시 에러
	
	public Point() {x=y=10;	}
	public Point(int x, int y) {this.x = x;	this.y = y;	}
	public int getX() { return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {	return y;}
	public void setY(int y) {this.y = y;}
	public void disp() {
		System.out.print("x="+x+", y="+y);
	}
}

class Circle extends Point{ //상속
	private int r;
	//Point pt; private시 다음 작업 필요함 
	public Circle() {
		//pt = new Point();
		//pt.setX()=pt.setY() = 0;
		x=y=r=0;
	}
	public Circle(int x,int y, int r) {
		super(x,y);
		this.r=r;
	}
	
	public int getR() {	return r;}
	public void setR(int r) {this.r = r;}
	public void disp() {
		//System.out.print("x="+x+", y="+y+", r="+r);
		super.disp(); //
		System.out.println(", r="+r);
	}

}//circle end

class Rect extends Point{
	private int x1,y1;
	public Rect() {
		x=y=0;
		x1=y1=10;
	}
	public Rect(int x,int y, int x1, int y1) {
		super(x,y);
		this.x1=x1;
		this.y1=y1;
	}
	
	public int getX1() {return x1;}
	public void setX1(int x1) {this.x1 = x1;}
	public int getY1() {return y1;}
	public void setY1(int y1) {this.y1 = y1;}
	public void disp() {
		super.disp();
		System.out.println(", x1="+x1+", y1="+y1);
	}
}//Rect end


public class MainEntry {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();
		// TODO Auto-generated method stub
		Point pt = new Point();
		
		Rect r = new Rect();
		r.disp();
		

	}

}
