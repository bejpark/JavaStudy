package quiz.di;

public class Worker extends Common implements Person {
	private String dep;
	private String rank;
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Worker(String name, int age) {
		super(name, age);
	}
	@Override
	public void move() {
		System.out.println(super.name+"(이)가 움직인다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		System.out.println(super.name+"(이)가 잔다.");

	}

	@Override
	public void eat() {
		System.out.println(super.name+"(이)가 밥을 먹는다.");

	}
	public void print() {
		System.out.println("*** 회사원 "+super.name+" ***");
		System.out.println("나이 : "+super.age+", 직급 : "+this.rank+", 부서 : "+this.dep);

	}

}
