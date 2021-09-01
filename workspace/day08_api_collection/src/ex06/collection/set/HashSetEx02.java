package ex06.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp=(Person)obj;
			
			return name.equals(temp.name) && age==temp.age;
		}
		return false;
	}
	
	
}//person end


public class HashSetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		Person p = new Person("aa",10);
		set.add(p);
		set.add(new Person("David",20));
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		//set.add(new Person("ssd",330));
		//set.add(new Person("sSd",330));


		
		System.out.println(set);
	}

}
