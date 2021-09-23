package com.kosta;

import java.util.ArrayList;

public class MyInfomation {
	
	private Person person;

	// setter method
	public void setPerson(Person person) {  // DI
		this.person = person;
	}
	
	public boolean processMessage(StudentPersonImpl student) {
		return this.person.personShow(student.getName(), student.getAge(), student.getGender());
	}
	
	public boolean processMessage(EmployeePersonImpl emp) {
		ArrayList hobbys= new ArrayList<String>();
		hobbys.add("aa");
		hobbys.add("dd");
		hobbys.add("cc");
		System.out.println(emp.personShow(hobbys));
		return this.person.personShow(emp);	}
	
	public boolean processMessage(String name, int age, String gender) {
		return this.person.personShow(name, age, gender);
	}

}
