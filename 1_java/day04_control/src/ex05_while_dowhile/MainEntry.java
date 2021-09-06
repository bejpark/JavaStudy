package ex05_while_dowhile;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		while(a<11) {
			System.out.println("Hello~"+a);
			a++;
		}
		
		int b = 1;
		int c = 1;
		do {
			
			do {
				System.out.print(b+"\t");
				b++;
			}while(b<=3);
			c++;
		}while(c<=2);
	}

}
