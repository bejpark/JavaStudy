package Quiz03;

public class PartTime extends Emp {
	private int pay,time,num,wage;
	public PartTime(String name, String rank, String dep,int time,int num,int wage) {
		super(name, rank, dep);
		this.time=time;
		this.num=num;
		this.wage=wage;
		// TODO Auto-generated constructor stub
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public String toString() {
		return super.toString()+"\n시급 : "+wage+", 일한 시간, 일수 : "+time+"시간, "+num+"일, 급여 : "+pay;
	}
	
}
