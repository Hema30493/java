package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCollege {
	public static void main(String[] args) {
		College c1=new College("Jeppiar", 70000, 234, "A");
		College c2=new College("Sathyabam",80000,678,"A");
		College c3 = new College("SRR", 75000, 889, "B");
		College c4=new College("Joshph",85000, 864, "B");
		College c5=new College("Panimalar", 65000, 789,"c");
		College c6=new College("Maamallan", 60000, 789, "c");
		ArrayList<College>collegeDetails=new ArrayList<>();
		collegeDetails.add(c1);
		collegeDetails.add(c2);
		collegeDetails.add(c3);
		collegeDetails.add(c4);
		collegeDetails.add(c5);
		collegeDetails.add(c6);
		List<College> a=collegeDetails.stream().filter(x->x.getGrade().equals("A")).collect(Collectors.toList());

		List<College> b=collegeDetails.stream().filter(x->x.getGrade().equals("B")).collect(Collectors.toList());

		List<College> c=collegeDetails.stream().filter(x->x.getGrade().equals("C")).collect(Collectors.toList());
 	
 	
 	}

}
