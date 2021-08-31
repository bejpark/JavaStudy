package Quiz01;

public class Plain extends Trans {
	
	public String name() {
		return "비행기";
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
