package kr.edu.kosta;

public class Student {
	private String name, group;
	private int grade;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


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
