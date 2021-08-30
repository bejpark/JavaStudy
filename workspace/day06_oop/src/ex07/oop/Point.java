package ex07.oop;

public class Point {
	private int x,y;

	public Point() {//디폴트 생성자함수
		//x=y=100;
		this(10,20); //첫 줄에 와야함.
	}

	public Point(int x) {//매개변수, 파라미터 
		//this.x=x;
		this(x,999);
		//y=999;
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public void disp() {
		System.out.print(x+", "+y);
	}
	

}
