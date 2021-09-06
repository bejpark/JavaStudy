package Quiz01;

public class Mainentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trans[] tr =  {new Bus(),new Bicycle(),new Plain(),new Subway()};
		//Object[] shape = {new Bus(),new Bicycle(),new Plain(),new Subway()};
		
		for(Trans array:tr) { 
			array.start();
			array.stop();
		}

	}

}
