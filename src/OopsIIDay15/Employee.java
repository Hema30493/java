package OopsIIDay15;

public class Employee extends Human {

	 
		 private int empid;
		 public void salary() {
			 System.out.println(30000);
			 
		 }
		 public void setempid(int empid) {
			 this.empid=empid;
		 }
		 public int getempid() {
			 return empid;
		 }
		 
	 public Employee(String name,int age, int empid) {
		 super(name,age);
			 this.empid=empid;
		 }
		 public String toString() {
			 return super.toString()+empid;
			 
		 }
	 }


