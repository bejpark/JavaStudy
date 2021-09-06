package Quiz;

//이름 직급 부서 급여 연락처
class Sawn{
	private String name, rank, dep,phone;
	private int pay;
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
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Sawn(String name, String rank, String dep, int pay, String phone) {
		this.name = name;
		this.rank = rank;
		this.dep = dep;
		this.pay = pay;
		this.phone = phone;
	}
	public Sawn() {
		name="이름";
		rank="직급";
		dep="부서";
		pay=0;
		phone="010-0000-0000";
	}
	public void disp() {
		System.out.println("****** 사원 정보 ******");
		System.out.println("이름 : "+name+", 직급 : "+rank+", 부서 : "+dep);
		System.out.println("급여 : "+pay+", 연락처 : "+phone);
	}
	
}//Sawn end


public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawn man = new Sawn();
		man.setName("박병제");
		man.setRank("사원");
		man.setDep("SW개발");
		man.setPay(50000000);
		man.setPhone("010-1234-1234");
		man.disp();

	}

}
