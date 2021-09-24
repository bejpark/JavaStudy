package quiz.aop;

public class Student {
	private String name, group;
	private int grade;
	
	public Student() {}
	
	
	public Student(String name, String group, int grade) {
		super();
		this.name = name;
		this.group = group;
		this.grade = grade;
	}


	public void show() {
		System.out.println("이름 : "+name+", 학년 : "+grade+", 반 : "+group);
	}

}
