package ex03.method;

//static method: 객체 생성없이 바로 사용 가능함 
//호출방법 OBjectname.methodname();
class A{
	int x,y;
	public static void setData(int xx,int yy) {
		System.out.println(xx+" , "+yy);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.setData(10, 20);
		
		A a = new A(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		a.setData(1, 2);
	}

}
