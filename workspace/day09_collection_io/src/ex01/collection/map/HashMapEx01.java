package ex01.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("kosa", "123");
		map.put("kingsmile", "1004");
		map.put("kosa", "123");
		//중복이 제거되는 형태
		System.out.println(map.size());
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id, pwd : ");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("pwd : ");
			String pwd = sc.nextLine().trim();	
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지않습니다.");
			}else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("");
				}else {
					System.out.println(id+" 와 "+pwd+" 가 일치합니다");
				}
			}
		}

	}

}
