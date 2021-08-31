package ex04.Abstract;

public class Rect extends Shape {
	int w=10;
	@Override
	public double calc(double x) {
		result = w*x;
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		calc(5.0);
		System.out.println(result+" 크기의"+name+" 이 생성되었습니다.");
		// TODO Auto-generated method stub

	}

}
