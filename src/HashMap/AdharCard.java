package HashMap;

public class AdharCard {
	private long adharNo;
	private String name;
	private int age;
	private String gender;
	private String fatherName;
	public void setadharNo(long adharNo) {
		this.adharNo=adharNo;
	}
	public long getadharNo() {
		return adharNo;
	}
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
	public void setgender(String gender) {
		this.gender=gender;
	}
	public String getgender() {
		return gender;
	}
	public void setfatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	public String getfatherName() {
		return fatherName;
	}
	public AdharCard(long adharNo,String name,int age,String gender,String fatherName) {
		this.adharNo=adharNo;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.fatherName=fatherName;
	
	}
	public String toString() {
		return adharNo+","+name+","+age+","+gender+","+fatherName;
	}

}
