package Quiz03;

public class Regular extends Emp {
	protected int pay;
	public Regular(String name, String rank, String dep,int pay) {
		super(name, rank, dep);
		this.pay=pay;
		// TODO Auto-generated constructor stub
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return super.toString()+" 급여 : "+pay;
	}
	
	

}
