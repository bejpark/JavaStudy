package quiz.aop;

public class Worker {
	private String name,dep,rank;
	
	public Worker() {}
	

	public Worker(String name, String dep, String rank) {
		super();
		this.name = name;
		this.dep = dep;
		this.rank = rank;
	}
	public void show() {
		System.out.println("이름 : "+name+", 부서 : "+dep+", 직급 : "+rank);
	}

}
