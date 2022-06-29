package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Bike {
	public static void main(String[] args) {
		HashMap<String,String> bikeDetails=new HashMap<>();
		bikeDetails.put("HG4J6K7","PULSUR");
		bikeDetails.put("8HJ56DF", "HONDA");
		bikeDetails.put("9GF67SE","HERO");
		bikeDetails.forEach((k,v)->System.out.println(k+","+v));
//		for(String var:bikeDetails.keySet()) {
//			System.out.println(var);
//	}
//		for(String var1:bikeDetails.values()) {
//			System.out.println(var1);
//	}
		Iterator itr=bikeDetails.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator itr1=bikeDetails.values().iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

}
}
