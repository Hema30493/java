package CollectionArrayList;

import java.util.ArrayList;

public class UseElection {
	public static void main(String args) {
		Election candidate1=new Election("Rani",45,59000,123,"ADMK");
		Election candidate2=new Election("Sekar",37,45000,345,"DMK");
		Election candidate3=new Election("Vimal",42,54000,234,"Admk");
		Election candidate4=new Election("Priya",34,36000,457,"DMK");
		Election candidate5=new Election("Kavin",35,45000,678,"DMK");
		ArrayList<Election> details=new ArrayList<>();
		details.add(candidate1);
		details.add(candidate2);
		details.add(candidate3);
		details.add(candidate4);
		details.add(candidate5);
		ArrayList<Election> party=new ArrayList<>();
		for(Election value:details) {
			if(value.getcandidateParty().equals("DMK")) {
				party.add(value);
			}
		}
		party.forEach(value->System.out.println(value));
	}

}
