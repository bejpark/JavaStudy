package quiz;

public class Quiz05 {
//이름,연락처,주소 출력하는 info 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "박병제";
		int phone = 01050317275;
		String addr = "서울특별시 동작구 상도1동";
		info(name,phone,addr);

	}
	
	public static void info(String name, int phone, String addr) {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("주소 : "+addr);

	}

}
