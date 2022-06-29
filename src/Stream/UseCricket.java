package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricket {
	public static void main(String[] args) {
		Cricket p1=new Cricket("Sachin",true,48,200,0);
		Cricket p2=new Cricket("Virat",true,33,150,0);
		Cricket p3=new Cricket("Bumrah",false,30,83,5);
		Cricket p4=new Cricket("Zaheer",false,42,22,2);
		Cricket p5=new Cricket("Ashish",false,46,6,0);
		Cricket p6=new Cricket("Bhuvaneshwar",false,34,15,2);
		ArrayList<Cricket> matchDetails=new ArrayList<>();
		matchDetails.add(p1);
		matchDetails.add(p2);
		matchDetails.add(p3);
		matchDetails.add(p4);
		matchDetails.add(p5);
		matchDetails.add(p6);
//		int max=0;
//		matchDetails.stream().filter(x->x.getisBatsman()==false).map(y->y.getplayerName().charAt(y.getplayerName().length()-1)).forEach(z->System.out.println(z));
//		String b="";
//		List<Cricket> l1= matchDetails.stream().filter(x->x.getisBatsman()==false).collect(Collectors.toList());
//		for(Cricket a2:l1) {
//			if(a2.getplayerScore()>max) {
//				max=a2.getplayerScore();
//				b=a2.getplayerName();
//			}
//		}
//		System.out.println(b+" is Highest Score");
//
//	List<Cricket> l= matchDetails.stream().filter(x->x.getage()<40 && x.getplayerScore()>50).collect(Collectors.toList());
//		for(Cricket a1:l) {
//			System.out.println(a1.getplayerName().substring(1,a1.getplayerName().length()-1));
//}
		 matchDetails.stream().filter(x->x.getage()<40 && x.getplayerScore()>50).map(y->y.getplayerName().substring(1,y.getplayerName().length()-1)).forEach(z->System.out.println(z));
				String a1="";
	List<Cricket>l=matchDetails.stream().filter(s->s.getplayerWicket()==0).collect(Collectors.toList());
	for(Cricket s1:l) {
		a1=a1.concat(s1.getplayerName());
	}
	System.out.println(a1);
//	matchDetails.stream().filter(x->x.getplayerName().contains("a") && x.getisBatsman()==true).map(y->y.getage()).forEach(z->System.out.println(z));
//	int max=0;
//	String b="";
//	List<String> a=matchDetails.stream().filter(x->x.getisBatsman()==false).map(y->y.getplayerName()).collect(Collectors.toList());
//	char[] c=a.getplayerName().toCharArray();
//	for(int i=c.length;i>0;i--) {
//		if(a.getplayerName().length()>max) {
//			b=b+a.getplayerName();
//		}
	}
	}
	

}
