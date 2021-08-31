package Quiz02;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tran[] tran = {(Tran)new Bus(), (Tran)new Plain()};
		for(int i=0;i<tran.length;i++) {
			tran[i].tranStart();
			tran[i].tranStop();
		}

	}

}
