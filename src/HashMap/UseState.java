package HashMap;

import java.util.HashMap;

public class UseState {
	public static void main(String[] args) {
		State s1=new State("M.K.stalin","TamilNadu","Chennai","Tamil",38);
		State s2=new State("Basavaraj Bommai","Karnataka","Bangalore","kanada",31);
		State s3=new State("Pinarayi Vijayan","Kerala","Thiruvananthapuram","Malayalam",14);
		State s4=new State("Uddhav Thackeray","Maharastra","Mumbai","Marathi",36);
		State s5=new State("Chandrashekar Rao","Telungana","Hyderabad","Telugu",31);
		State s6=new State("Nitish Kumar","Bihar","Patna","Hindi",38);
		State s7=new State("Navin Patnaik","Odisa","Bhubaneswar","Odia",30);
		State s8=new State("Bhupendrabhai Patel","Gujarat","Gandhinagar","Gujarati",33);
		State s9=new State("Ashok Gehlot","Rajasthan","Jaipur","Rajasthani",33);
		State s10=new State("Shivraj Singh Chouhan","Madhyaprdesh","Bhopal","Hindi",50);
		HashMap<String,State> details=new HashMap<>();
		details.put(s1.getstateName(),s1);
		details.put(s2.getstateName(), s2);
		details.put(s3.getstateName(), s3);
		details.put(s4.getstateName(), s4);
		details.put(s5.getstateName(), s5);
		details.put(s6.getstateName(), s6);
		details.put(s7.getstateName(), s7);
		details.put(s8.getstateName(), s8);
		details.put(s9.getstateName(), s9);
		details.put(s10.getstateName(), s10);
//		for(State val:details.values()) {
//			System.out.println(val);
//			
//		}

//		int max=0;
//		State b=null;
//		for(State val1:details.values()) {
//			if(val1.gettotalDistrict()>max) {
//				max=val1.gettotalDistrict();
//				b=val1;	
//			}
//		}
//		System.out.println(b);
		State c=null;
		for(State val2:details.values()) {
			if(val2.getlang().equals("Hindi")) {
				c=val2;
				System.out.println(c);
			}
		}
	
	}
}
