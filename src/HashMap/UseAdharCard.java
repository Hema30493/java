package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseAdharCard {
	public static void main(String[] args) {
		AdharCard a1=new AdharCard(9876545789909l,"Jack",23,"Male","Michel");
		AdharCard a2=new AdharCard(279289809999l,"Mani",43,"Male","Suresh");
		AdharCard a3=new AdharCard(87894890099l,"Maha",25,"Female","Mahesh");
		AdharCard a4=new AdharCard(879980545678l,"Sudha",45,"Female","Ragu");
		AdharCard a5=new AdharCard(865689009878l,"Ragu",41,"Male","suresh");
		AdharCard a6=new AdharCard(863487240997l,"Mala",32,"Female","Remaesh");
		AdharCard a7=new AdharCard(729838029103l,"Vijay",46,"Male","Raja");
		AdharCard a8=new AdharCard(897657354589l,"Pooja",27,"Female","Surya");
		AdharCard a9=new AdharCard(378429872799l,"Guna",32,"Male","Prakash");
		AdharCard a10=new AdharCard(73834209808l,"Shakthi",29,"Female","Ragul");
		HashMap<Long,AdharCard> details=new HashMap<>();
		details.put(a1.getadharNo(),a1);
		details.put(a2.getadharNo(),a2);
		details.put(a3.getadharNo(),a3);
		details.put(a4.getadharNo(),a4);
		details.put(a5.getadharNo(),a5);
		details.put(a6.getadharNo(),a6);
		details.put(a7.getadharNo(),a7);
		details.put(a8.getadharNo(),a8);
		details.put(a9.getadharNo(),a9);
		details.put(a10.getadharNo(),a10);
		String a="";
		for(AdharCard adhar:details.values()) {
			a=a.concat(adhar.getname());
		}
		System.out.println(a);
		Iterator itr=details.keySet().iterator();
		while(itr.hasNext()) {
			if(details.get(itr.next()).getgender().equals("Female")) {
				itr.remove();
			}
		}
		details.forEach((k,v)->System.out.println(k+","+v));
		
		int max=0;
		String b="";
		for(AdharCard var:details.values()) {
			if(var.getage()>max) {
				max=var.getage();
				b=var.getname();	
			}
		}
		System.out.println(b);

}
}