package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap();
		map.put("현수", new Integer(90));
		map.put("재민", new Integer(900));
		map.put("다혜", new Integer(1000));
		map.put("수오", new Integer(80));
		map.put("병민", new Integer(56));
		/*
		Set set = map.entrySet();
		Iterator it = set.iterator();
		*/
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); //next 타입이 object이므로 형변환 필요
			System.out.println("name : "+e.getKey()+", score : "+e.getValue());
		}
		
		Set set = map.keySet();

		System.out.println("참가자 명단 : "+set);
		
		Collection values = map.values();
		it = values.iterator();
		int total=0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total+=i.intValue();
		}
		
		System.out.println("total : "+total);
		System.out.println("avg : "+(float)total / set.size());
		System.out.println("max : "+Collections.max(values));
		

	}

}
