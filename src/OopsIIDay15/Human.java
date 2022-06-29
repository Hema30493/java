package OopsIIDay15;

public class Human {

	
		private String name;
		private int age;
		public void setname(String name) {
			this.name=name;
		}
	public String getname() {
		return name;
		
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+age;
	}
	}


