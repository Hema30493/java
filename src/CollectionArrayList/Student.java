package CollectionArrayList;

public class Student {
	private String name;
	private int id;
	private int age;
	private int fees;
	private boolean isMale;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setfees(int fees) {
		this.fees=fees;
	}
	public int getfees() {
		return fees;
		
	}
	public void setisMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getisMale() {
		return isMale;
	}
	public Student(String name, int id, int age, int fees, boolean isMale) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.fees=fees;
		this.isMale=isMale;
	}
	public String toString() {
		return name+","+id+","+age+","+fees+","+isMale;
	}

}
