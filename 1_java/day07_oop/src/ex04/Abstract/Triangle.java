package ex04.Abstract;

public class Triangle extends Shape {
	int w=100;

	@Override
	public double calc(double x) {
		result = (x*w)/2;
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result+" 크기의 "+name+" 이 그려졌습니다.");
		// TODO Auto-generated method stub

	}

}
