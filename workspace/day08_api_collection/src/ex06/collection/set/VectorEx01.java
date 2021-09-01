package ex06.collection.set;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class VectorEx01 {
//List:순서있고 중복허용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length / capacity");
		System.out.println(v.size()+" / "+v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3,4);
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(2);
		System.out.println(v2.size()+" / "+v2.capacity());
		
		//iterator
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("지운후");
		
		//get
		for(int i=0;i<v2.size();i++) {
			System.out.println(v2.get(i));
		}
		
		//sort result
		Collections.sort(v2);
		
		//elementAt()
		//trimtToSize()
	}

}
