package ex08.staticMember;

class Atm{
	int count;//instance member
	static int total;//static member
	
	public Atm(int amount) {
		count +=amount;
		total +=amount;
	}
	//static member에서 일반멤버 변수 사용할 수 없다.
	public static void view() {
		total=total+100;
	}
	public static void show(int count, int total) {
		
	}
	public void display() {
		System.out.println("count = "+count);
		System.out.println("total = "+total);
	}
}
public class MainEntry {

	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display(); //c:1000, t:1000
		System.out.println("==============");
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("==============");
		Atm at3 = new Atm(1000);
		at3.display();
		System.out.println("==============");


	}

}
