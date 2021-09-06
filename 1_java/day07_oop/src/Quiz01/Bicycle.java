package Quiz01;

public class Bicycle extends Trans {

	public String name() {
		return "자전거";
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(name()+" Stop");
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(name()+" Start");
	}

}
