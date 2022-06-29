package OopsDay14;

public class UseEmplyee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setname("Hema");
		e.setid(113);
		e.setcity("Chennai");
		System.out.println(e.getname()+", "+e.getid()+", "+e.getcity());
	}

}
