package ex05.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,3,5,2,8};
		int temp;
		
		System.out.println("**** 소트 전 출력 : ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		
		for (int i=0;i<a.length;i++) {

			for(int j=i;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		
		System.out.println("\n**** 소트 후 출력 : ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
	}

}
