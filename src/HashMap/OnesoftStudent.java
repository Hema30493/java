package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class OnesoftStudent {
	public static void main(String[] args) {
		HashMap<Integer,String> studentDetails=new HashMap<>();
		studentDetails.put(234,"Raja");
		studentDetails.put(567, "Rani");
		studentDetails.put(568, "Jeni");
		//System.out.println(studentDetails.get(567));
		
//		for(Integer var:studentDetails.keySet()) {
//			System.out.println(var);
//		}
//		
//		for(String var1:studentDetails.values()) {
//			System.out.println(var1);
//		}
		
		//studentDetails.forEach((k,v)->System.out.println(k+","+v));
//		
//		Iterator itr=studentDetails.keySet().iterator();
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//		}
//		Iterator itr1=studentDetails.values().iterator();
//		while(itr1.hasNext()) {
//			
//			System.out.println(itr1.next());
//		}
		
		for(Integer var:studentDetails.keySet()) {
			if(var>200) {
				System.out.println(studentDetails.get(var));
			}
		}
	}

}

