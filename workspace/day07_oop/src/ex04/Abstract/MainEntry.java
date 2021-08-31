package ex04.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] ss = new Shape[3];
		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		String[] name = {"circle","rect","triangle"};
		for(int i=0;i<ss.length;i++) {
			ss[i].show(name[i]);
		}
		
		
		
		//Shape 부모 추상 클래스를 이용
		Shape sh = new Circle();
		sh.show("Circle Circle");
		sh = new Rect();
		sh.show("TT");
		sh = new Triangle();
		sh.show("RR");
		
		
		//각자 클래스로 객체 생성
		Circle s = new Circle();
		s.show("circle");
		
		Rect r = new Rect();
		r.show("Rectangle");
		Triangle t = new Triangle();
		t.show("삼각형");
		

	}

}
