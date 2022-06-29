package CollectionArrayList;

import java.util.ArrayList;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer programmer1=new Programmer("Raja",111,"Male","Tester","JAVA");
		Programmer programmer2=new Programmer("Rosie",123,"Female","Developer","PHP");
		Programmer programmer3=new Programmer("Jack", 345,"Make","Trainer","PYTHON");
		Programmer programmer4=new Programmer("Sanjai",564,"Male","Manager","HTML");
		Programmer programmer5=new Programmer("Stella",346,"Female","Team Leade","JAVA");
		ArrayList<Programmer> details=new ArrayList<>();
		details.add(programmer1);
		details.add(programmer2);
		details.add(programmer3);
		details.add(programmer4);
		details.add(programmer5);
		ArrayList<Programmer> javaProgrammers=new ArrayList<>();
		for(Programmer pro:details) {
			if(pro.getcodingLang().equals("JAVA")) {
				javaProgrammers.add(pro);
			}
		}
		javaProgrammers.forEach(pro->System.out.println(pro));
		
		System.out.println(" ");
		
		details.forEach(prog-> { if(prog.getname().startsWith("S")) {
			System.out.println(prog);
		}
		});
	}

}
