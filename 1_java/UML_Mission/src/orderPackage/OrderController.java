package orderPackage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;


public class OrderController {
	//수주정보 : (고객번호(회원번호), 고객명, 주소, 전화번호), (수주번호, 수주날짜, 고객명, 수주수량)
	Vector<Orders> orders = new Vector<Orders>();
	Vector<User> user = new Vector<User>();
	Scanner sc = new Scanner(System.in);
	public void run() throws NumberFormatException, IOException{
		int orderCode = 1;
		int userCode = 1;
		boolean flag = true;
		System.out.println("***** 주문 접수 프로그램 *****");
		while(flag) {
			System.out.println("번호를 입력하세요. [고객 등록 : 1], [수주 등록 : 2], [수주 취소 : 3], [종료 : 4]");
			int command = sc.nextInt();
			switch(command) {
			case 1: 
				register(userCode);
				userCode++;
				break;
			case 2:
				registerOrder(orderCode);
				orderCode++;
				break;
			case 3:
				cancelOrder();
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}

		
	}
	
	public void registerOrder(int orderCode) {
		System.out.println("***** 수주 등록 *****");
		String ordererName;
		String ordererProduct;
		int orderNum;
		Date date = null;
		System.out.print("고객명을 입력하세요 : ");
		ordererName=sc.next();
		System.out.println("----- 제품 정보 -----");
		
		System.out.print("주문할 제품을 입력하세요 : ");
		ordererProduct=sc.next();

		System.out.print("제품의 수량을 입력하세요 : ");
		orderNum = sc.nextInt();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String formatedNow = formatter.format(date);

		orders.add(new Orders(orderCode,formatedNow));
		
		System.out.println("[구매하는 고객 : "+ordererName+", 구매하는 제품 : "+ordererProduct+", 수량 : "+orderNum);
		System.out.println("[수주번호 : "+orderCode);
		System.out.println("----- 정상적으로 주문되었습니다. -----");


	}
	public void register(int userCode) {
		String userName;
		String userAddr;
		String userPhone;
		System.out.println("***** 고객 등록 *****");
		System.out.print("이름을 입력하세요 : ");
		userName=sc.next();
		System.out.print("주소를 입력하세요 : ");
		userAddr=sc.next();
		System.out.print("번호를 입력하세요 : ");
		userPhone=sc.next();
		user.add(new User(userCode,userName,userAddr,userPhone));
		System.out.println("----- 정상적으로 등록되었습니다. -----");

	}
	
	public void cancelOrder() {
		System.out.println("***** 수주 취소 *****");
		System.out.println("고객명을 입력하세요 : ");
		
		System.out.println("----- ~님의 수주목록 -----");
		System.out.println("취소하실 수주번호를 입력하세요 : ");
		
		System.out.println("수주번호 : ~가 정상적으로 취소되었습니다.");
		

	}

}
