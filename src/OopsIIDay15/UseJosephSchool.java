package OopsIIDay15;

public class UseJosephSchool {
	public static void main(String[] args) {
		JosephSchool s=new JosephSchool();
		s.details("Raja", 15, "A1");
		System.out.println("Total: "+s.total(90,85,98,94,93));
		int ff=s.total(90,85,98,94,93);

		System.out.println(s.avg(ff));
	}
	}

