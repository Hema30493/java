package CollectionArrayList;

import java.util.ArrayList;

public class Employee1 {
	public static void main(String[] args) {
		ArrayList <Integer> employeeId=new ArrayList<>();
		employeeId.add(12);
		employeeId.add(34);
		employeeId.add(45);
		employeeId.add(56);
		employeeId.add(33);
		//for(int i=0;i<employeeId.size();i++) {
			//System.out.println(employeeId.get(i));
	//}
		//for(Integer emp:employeeId) {
			//System.out.println(emp);
		//}
		//employeeId.forEach(emp->System.out.println(emp));
		
		for(int i=0;i<employeeId.size();i++) {
			if(employeeId.get(i)%2==0) {
				System.out.println(employeeId.get(i)+" is even no");
			}
			else {
				System.out.println(employeeId.get(i)+" is Odd no");
			}
		}
			
			Integer max=0;
			for(Integer emp:employeeId) {
				if(emp>max) {
					max=emp;
				}
			}
			System.out.println("maximum value is:"+max);
		}
	}

