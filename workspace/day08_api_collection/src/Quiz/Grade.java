package Quiz;

public class Grade {
	private int sub1,sub2,sub3,sum;
	private double avg;
	private String name;
	private char score;
	public Grade() {
		
	}
	public Grade(int sub1, int sub2, int sub3, String name) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.name = name;
		this.sum = sub1+sub2+sub3;
		this.avg = (double)sum/3;
		setScore();
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = sub1+sub2+sub3;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getScore() {
		return score;
	}
	public void setScore() {
			if(this.avg>=90)
				this.score='A';
			else if(avg>=80)
				this.score='B';
			else if(avg>=70)
				this.score='C';
			else if(avg>=60)
				this.score='D';
			else
				this.score='F';	
	}
	
	@Override
	public String toString() {
		return "****** "+this.name+" 학생의 성적표 ******\n"+
				"국어 : "+this.sub1+", 전산 : "+this.sub2+", 영어 : "+this.sub3+
				"총점 : "+this.sum+", 평균 : "+this.avg+", 학점 : "+this.score;
	}
	
	

	

}
