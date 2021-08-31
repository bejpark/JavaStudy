package Quiz03;
//이름, 연락처, 부서, 직급 // 급여
//-> Regular(자식)
//-> Sales double 영업(자손) 건당 0.3~0.5
//-> PartTime 시간*일수*8500(emp의 자식)
public class Emp {
	private String name, rank, dep;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	public Emp(String name, String rank, String dep) {
		this.name = name;
		this.rank = rank;
		this.dep = dep;
	}
	public Emp() {
		name="이름";
		rank="직급";
		dep="부서";
	}
	
	@Override
	public String toString() {
		return "이름 : "+name+", 직급 : "+rank+", 부서 : "+dep;
	}
	
	
}

