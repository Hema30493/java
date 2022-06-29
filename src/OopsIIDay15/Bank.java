package OopsIIDay15;

public class Bank {
	public int loanAvail() {
		return 30000;
	}
	public int loanAvail(int sal) {
		return 30000+sal;
	}
	public int loanAvail(int sal, int noofpro) {
		return 30000+sal+(sal*noofpro/100);
	}
}

