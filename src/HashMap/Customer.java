package HashMap;

public class Customer {
	private String name;
	private int age;
	private String email;
	private long accNumber;
	private long accBalance;
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
	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setaccNumber(long accNumber) {
		this.accNumber=accNumber;
	}
	public long getaccNumber() {
		return accNumber;
	}
	public void setaccBalance(long accBalance) {
		this.accBalance=accBalance;
	}
	public long getaccBalance() {
		return accBalance;
	}
	
	public Customer(String name,int age,String email,long accNumber,long accBalance) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.accNumber=accNumber;
		this.accBalance=accBalance;
	}
	public String toString() {
		return name+","+age+","+email+","+accNumber+","+accBalance;
	}

}
