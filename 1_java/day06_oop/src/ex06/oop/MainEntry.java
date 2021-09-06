package ex06.oop;
//접근지정자 : private<default<protected<public
class Point{
	private int x,y; //point 클래스의 멤버변수
	
//	public void setXY(int xx, int yy) {
//		x=xx;
//		y=yy;
//	}
	
	public void setX(int xx) {x=xx;}
	public int getX() {return x;}
	public void setY(int yy) {x=yy;}
	public int getY() {return y;}
	
	public void display() {
		System.out.println(x+", "+y);
	}
	
}//Point end

/*
char getCh(char a) {
	return a;
}
void setch(char a) {
	this.a = a;
}
*/

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt = new Point(); //객체생성, 메모리할당, 생성자함수 자동호출
		
		//pt.setXY(12, 13);
		pt.display();
		
		
		//System.out.print(pt.x+" , "+pt.y); //멤머변수는 촏기값이 있음 

		//pt.x = 9;
		//pt.y = 8;
		//System.out.print(pt.x+" , "+pt.y);
		//그렇게 좋은방법은 아님
		
	}

}
