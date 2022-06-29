package Stream;

public class College {
	private String name;
	private int fees;
	private int code;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", fees=" + fees + ", code=" + code + ", grade=" + grade + "]";
	}
	public College(String name, int fees, int code, String grade) {
		super();
		this.name = name;
		this.fees = fees;
		this.code = code;
		this.grade = grade;
	}
	
}
