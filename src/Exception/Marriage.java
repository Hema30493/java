package Exception;

public class Marriage {
	public static void main(String[] args) {
	int brideAge=17;
	int groomAge=22;
	try {
		if(brideAge<18 && groomAge<22) {
			throw new AgeException("Bride and groom age is not valid");
		}
		else if(brideAge<18 && groomAge>=22) {
			throw new AgeException("Bride age is not valid");
		}
		else if(brideAge>=18 && groomAge<22) {
			throw new AgeException("Groom age is not valid");
		}
		else {
			System.out.println("both are have Elgible age for Marriage");
		}
	} catch(AgeException a) {
		a.printStackTrace();
	}
	System.out.println("Something");
	}

}
