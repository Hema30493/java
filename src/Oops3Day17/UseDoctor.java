package Oops3Day17;

public class UseDoctor {
	public static void main(String[] args) {
		Doctor d=new Doctor();
		d.salaryPerHour=500;
		d.workingHour=12;
		System.out.println(d.calculateSalary(d.salaryPerHour, d.workingHour));
	}

}
