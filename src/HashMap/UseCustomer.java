package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {
	public static void main(String[] args) {
		Customer c1=new Customer("Raja",34,"sraja567@gmail.com",89542567899l,500000);
		Customer c2=new Customer("Kavin",26,"kavin876@gmail.com",875642900689l,45688);
		Customer c3=new Customer("Jack",35,"jack654@gmail.com",78543990877l,780000);
		Customer c4=new Customer("Rose",27,"rose987@gmail.com",48989023088l,560000);
		Customer c5=new Customer("Janani",35,"janani897@gmail.com",86533257888l,850000);
		Customer c6=new Customer("Mani",29,"mani876@gmail.com",98979772931l,670000);
		Customer c7=new Customer("Rani",45,"rani9786@gmail.com",866544337989l,560000);
		Customer c8=new Customer("Maha",34,"maha678@gmail.com",736289028103l,750000);
		Customer c9=new Customer("Pooja",29,"pooja786@gmail.com",3767837890l,42000);
		Customer c10=new Customer("Bala",40,"bala567@gmail.com",679880987589l,500000);
		HashMap<Long,Customer> customerDetails=new HashMap<>();
		customerDetails.put(c1.getaccNumber(),c1);
		customerDetails.put(c2.getaccNumber(),c2);
		customerDetails.put(c3.getaccNumber(),c3);
		customerDetails.put(c4.getaccNumber(),c4);
		customerDetails.put(c5.getaccNumber(),c5);
		customerDetails.put(c6.getaccNumber(),c6);
		customerDetails.put(c7.getaccNumber(),c7);
		customerDetails.put(c8.getaccNumber(),c8);
		customerDetails.put(c9.getaccNumber(),c9);
		customerDetails.put(c10.getaccNumber(),c10);
		//System.out.println(customerDetails.get(c3.getaccNumber()));
//		for(Customer var:customerDetails.keySet()) {
//			System.out.println(var);
//		
//		}
////		customerDetails.forEach((k,v)->System.out.println(k+","+v));
//		int max=0;
//		Customer a=null;
//		for(Customer var:customerDetails.values()) {
//			if(var.getage()>max) {
//				max=var.getage();
//				a=var;
//				
//			}
//		}
//				System.out.println(a);
//			
				
		Iterator itr=customerDetails.keySet().iterator();
		while(itr.hasNext()) {
			if(customerDetails.get(itr.next()).getaccBalance()<50000) {
				itr.remove();
			}
		}
		customerDetails.forEach((k,v)->System.out.println(k+","+v));
	}

}
