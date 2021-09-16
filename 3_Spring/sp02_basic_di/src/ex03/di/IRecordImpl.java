package ex03.di;

public class IRecordImpl implements IRecord {
	private int kor,eng,math;

	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public IRecordImpl(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public IRecordImpl() {
		super();
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.kor+this.eng+this.math;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/3;
	}
	

}
