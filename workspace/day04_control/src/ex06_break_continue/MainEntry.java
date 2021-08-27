package ex06_break_continue;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++) {
			if(i==7)break;
			System.out.println(i);
		}
		for(int i=0;i<11;i++) {
			if(i==7)continue;
			System.out.println(i);
		}
		
	}

}
