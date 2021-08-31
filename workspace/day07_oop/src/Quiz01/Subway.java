package Quiz01;

public class Subway extends Trans {
	
	public String name() {
		return "지하철";
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
