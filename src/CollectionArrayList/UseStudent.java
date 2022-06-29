package CollectionArrayList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new Student("Raja",11,15,30000,true); 
		Student student2 = new Student("Priya",12,16,25000,false); 
		Student student3 = new Student("sekar",13,13,30000,true); 
		Student student4 = new Student("Rani",14,17,50000,false); 
		Student student5 = new Student("selvam",15,18,60000,true); 
		Student student6 = new Student("Peter",16,10,20000,true); 
		Student student7 = new Student("stella",17,13,30000,false); 
		Student student8 = new Student("Pooja",18,17,75000,false); 
		Student student9 = new Student("Jai",19,12,25000,true);
		Student student10 = new Student("Rose",20,10,20000,false); 
		ArrayList <Student> details=new ArrayList<>();
		details.add(student1);
		details.add(student2);
		details.add(student3);
		details.add(student4);
		details.add(student5);
		details.add(student6);
		details.add(student7);
		details.add(student8);
		details.add(student9);
		details.add(student10);
//		for(int i=0;i<details.size();i++) {
//			System.out.println(details.get(i));
//		}
		Integer max=0;
		for(Student detail:details) {
			if(detail.getisMale()==true && detail.getage()>max) {
				max=detail.getage();
			}
			}
		System.out.println("maximum age:"+max);
		Integer total=0;
		for(Student totalfees:details) {
			total=total+totalfees.getfees();
		}
		System.out.println("Toatl fees is "+total);
		
		ArrayList<Student> femalestudents=new ArrayList<>();
		for(Student std:details) {
			if(std.getisMale()==false) {
				femalestudents.add(std);
			}
		}
		femalestudents.forEach(std->System.out.println(std));
		//for(Student std:femalestudents) {
			//System.out.println(std);
		//}
	}

}
