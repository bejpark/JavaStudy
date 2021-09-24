package kr.edu.kosta;

public class Worker {
	private String name,dep,rank;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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
