package Quiz03;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] A = {new Regular("사원1","직급1","부서1",5000),new Sales("사원2","직급2","부서2",3000,3),new PartTime("사원3","Part-time","부서3",8,5,8500)};
		for (int i=0;i<A.length;i++) {
			System.out.println("========= 사원 "+i+"의 정보 =========");
			System.out.println(A[i]);
			System.out.println();
		}
	}

}
