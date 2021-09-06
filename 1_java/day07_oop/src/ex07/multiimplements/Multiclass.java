package ex07.multiimplements;

import ex04.Abstract.Shape;
import ex06.Interface.IDraw;

public class Multiclass extends Shape implements IDraw, Test {


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("IDraw interface ");
	}

	@Override
	public double calc(double x) {
		System.out.println("shape class");
		// TODO Auto-generated method stub
		return 5.5;
	}

	@Override
	public void show(String name) {
		System.out.println("shape class method");
		// TODO Auto-generated method stub

	}

	@Override
	public void tView() {
		System.out.println("Test interface");
		
	}

}
