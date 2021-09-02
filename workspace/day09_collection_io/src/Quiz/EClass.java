package Quiz;

public class EClass {
	protected String name, rank, dep;


	public EClass(String name, String rank, String dep) {
		super();
		this.name = name;
		this.rank = rank;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "사원 정보 :  [이름 : " + name + ", 직급 : " + rank + ", 부서 : " + dep + "]\r\n";
	}
	
	

}
