package ex06.Interface;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BB b = new BB();
			b.draw();
			
			IDraw i = new BB();
			i.draw();
			System.out.println(i.su);
	}

}
