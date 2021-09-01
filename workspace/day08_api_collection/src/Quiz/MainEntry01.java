package Quiz;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
/*
  Customer class

   id, name, address, tel

   생성자함수, set/get method

   고객추가 / 삭제 / 고객 리스트 출력 / 수정 / 프로그램 종료 출력하는 프로그램 작성하기.
 */
public class MainEntry01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Customer> customer = new Vector<Customer>();
		String name,addr,tel;
		int delIdx,modIdx,idx=1;
		boolean flag = true;//프로그램 종료 구분
		System.out.println("*** 고객 관리 프로그램 ***");

		while(flag) {
			Scanner sc = new Scanner(System.in);

			System.out.println("작업을 선택하세요 1:추가 / 2:삭제 / 3:고객 리스트 출력 / 4:고객 수정 / 5:프로그램 종료");
			switch(sc.next()) {
			case "1":
				System.out.println("<< 1:추가를 선택하셨습니다. >>");
				System.out.println("고객 번호 : "+idx);
				System.out.print("이름을 입력하세요 : ");
				name=sc.next();
				System.out.print("주소를 입력하세요 : ");
				addr=sc.next();
				System.out.print("번호를 입력하세요 : ");
				tel=sc.next();
				customer.add(new Customer(idx, name, addr, tel));
				idx++;
				System.out.println();
				break;
			case "2":
				System.out.println("<< 2:삭제를 선택하셨습니다. >>");
				System.out.print("삭제할 고객의 번호 : ");
				delIdx = sc.nextInt();
				boolean nocustomer = true;
				Iterator it = customer.iterator();
				while(it.hasNext()) {
					Customer c = (Customer)it.next();
					if(c.getIdx()==delIdx) {
						it.remove();
						System.out.println("고객"+delIdx+" 의 정보를 삭제했습니다.");
						nocustomer = false;
					}
				}
				if (nocustomer)
					System.out.println("고객"+delIdx+" 의 정보가 없습니다.");
				break;
			case "3":
				System.out.println("<< 3:고객 리스트 출력을 선택하셨습니다. >>");
				if(customer.size()==0)
					System.out.println("고객 리스트가 없습니다.");
				else
					for(int i=0;i<customer.size();i++) 
						System.out.println(customer.get(i));
				break;
			case "4":
				System.out.println("<< 4:수정을 선택하셨습니다. >>");
				System.out.print("수정 할 고객 번호를 입력하세요 : ");	
				modIdx = sc.nextInt();
				boolean nocustomer2 = true;
				Iterator it2 = customer.iterator();
				while(it2.hasNext()) {
					Customer c2 = (Customer)it2.next();
					if(c2.getIdx()==modIdx) {
						System.out.print("수정할 이름을 입력하세요 : (기존 이름 : "+c2.getName()+" ) ->");
						name=sc.next();
						System.out.print("수정할 주소를 입력하세요 : (기존 이름 : "+c2.getAddress()+" ) ->");
						addr=sc.next();
						System.out.print("수정할 번호를 입력하세요 : (기존 이름 : "+c2.getTel()+" ) ->");
						tel=sc.next();
						c2.setName(name);
						c2.setTel(tel);
						c2.setAddress(addr);
						System.out.println("고객"+modIdx+" 의 정보를 수정했습니다.");
						nocustomer2=false;
					}
				}
				if (nocustomer2)
					System.out.println("고객"+modIdx+" 의 정보가 없습니다.");
				break;
				
			case "5":
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~5 중에서 입력하세요.");
			}
			
		}
		


	}

}
