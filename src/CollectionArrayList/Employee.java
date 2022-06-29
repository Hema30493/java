package CollectionArrayList;

import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList <Integer> empId = new ArrayList<>();
		empId.add(12);
		empId.add(15);
		empId.add(34);
		empId.add(45);
		//empId.remove(1);
		empId.add(1,67);
		//empId.set(1, 25);
		System.out.println(empId.get(2));
	}

}
