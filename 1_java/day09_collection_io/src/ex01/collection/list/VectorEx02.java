package ex01.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		v.addElement("java");
		v.addElement(new Double(10.2));
		v.addElement(date);
		System.out.println(v.size()+", "+v.capacity());
		
		for(i=0;i<10;i++)
			v.addElement(new Integer(i));
		
		System.out.println(v.size()+", "+v.capacity());
		
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
			System.out.print(enu.nextElement()+"\t");
		
		
		System.out.println("객체 내용 포함 확인");
		
		if(v.contains("java")) System.out.println("yes");
		else System.out.println("no");
		
		System.out.println("10.2 객체 위치 : "+v.indexOf(new Double(10.2)));
		System.out.println("입력 시간 : "+date);
		System.out.println(v.get(v.indexOf(date)));
		
		//삭제
		System.out.println(v.size()+", "+v.capacity());
		System.out.println(v);
		for(i=0;i<v.size();i++) 
			v.removeElementAt(i);
		
		System.out.println(v.size()+", "+v.capacity());
		System.out.println(v);
		v.setElementAt("kkk", 2);
		System.out.println(v);
		v.trimToSize();
		System.out.println(v.size()+", "+v.capacity());
		v.setSize(2);
		System.out.println(v);
		System.out.println(v.size()+", "+v.capacity());

		
	}//main

}
