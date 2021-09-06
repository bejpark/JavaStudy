package ex07.multiimplements;

import ex04.Abstract.Shape;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiclass mc = new Multiclass();
		mc.draw();
		System.out.println(mc.calc(12.34));
		mc.tView();
		mc.view();
		System.out.println("==========");
		Shape s = new Multiclass();
		s.view();
		Test t = new Multiclass();
		t.tView();
	}

}
