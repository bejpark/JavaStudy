package Quiz03;

public class Sales extends Regular {
	int award;
	double insentive;
	public Sales(String name, String rank, String dep,int pay, int award) {
		super(name, rank, dep,pay);
		this.award=award;
		// TODO Auto-generated constructor stub
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}
	
	@Override
	public String toString() {
		insentive = award*0.3*pay;
		return super.toString()+"\n"+award + "건에 대한 추가 수령액 : " + insentive+"\n실 수령액 : "+((double)pay+insentive);
	}	
	
}
