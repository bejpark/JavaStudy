package ex02.operator;

public class OperatorTest2 {
	public static void main(String[] args) {
		
		int x = 10,y;
		y=x++;
		y=x>>3; //right shift : 원래값/2^비트수 
		System.out.println(x);
		System.out.println(y);
	}

}
