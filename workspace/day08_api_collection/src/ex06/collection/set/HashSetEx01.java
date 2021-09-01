package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet();
		hs.add("키보드");
		hs.add("컵");
		hs.add("볼펜");		
		hs.add("키보드");

		System.out.println("ㅇㅅㄱㅅ : "+hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		HashSet<Integer> hs1 = new HashSet(); //<>안에는 객체형 자료형만 가능
		hs1.add(100);
		hs1.add(34);
		
		it = hs1.iterator();
		for(Integer item:hs1) {
			System.out.println(item);
		}
		System.out.println(hs1);

	}

}