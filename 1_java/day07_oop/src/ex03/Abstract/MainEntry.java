package ex03.Abstract;


abstract class Shape{
	double result=0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super Class Shape");
	}
}//shape end

class Circle extends Shape{

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이 : "+result+"인 원을 그렸습니다.");
		// TODO Auto-generated method stub
		
	}
	
}

class Triangle extends Shape {
	int w=10,h=20;
	@Override
	public double calc() {
		result = (w*h)/2;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : "+result+"인 삼각형을 그렸습니다.");

		// TODO Auto-generated method stub
		
	}
}//triangle end

class Rect extends Shape{
	int w=10,h=20;

	@Override
	public double calc() {
		result = w*h;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : "+result+"인 사각형을 그렸습니다.");
		// TODO Auto-generated method stub
		
	}
}
public class MainEntry {
	public static void main(String[] args) {
		//Shape s = new Shape(); //오류 발생, 자체적으로 객체 생성 못함
		Triangle t = new Triangle();
		t.draw();
		Rect r = new Rect();
		r.draw();
	}//main end

}//MainEntry
