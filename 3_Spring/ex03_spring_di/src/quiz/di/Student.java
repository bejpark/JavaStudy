package quiz.di;

public class Student extends Common implements Person {
	private String major;
	private double score;
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double d) {
		this.score = d;
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
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
		System.out.println("*** 학생 "+super.name+" ***");
		System.out.println("나이 : "+super.age+", 전공 : "+this.major+", 학점 : "+this.score);

	}

}
