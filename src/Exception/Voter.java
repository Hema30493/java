package Exception;

public class Voter {
	public static void main(String[] args) throws AgeException {
//		int age=17;
//		
//		if(age<18) {
//			throw new AgeException("Age is not approved");
//			
//		}
//		else {
//			System.out.println("Eligible");
//		}
//		
//		System.out.println("Something");
//	}

	//public static void main(String[] args) {
		int age=17;
		try {
		if(age<18) {
			throw new AgeException("Age is not approved");
			
		}
		else {
			System.out.println("Eligible");
		}
		} catch(AgeException a) {
			a.printStackTrace();
		}
		finally {
			System.out.println("It always run");
		}
		System.out.println("Something");
	}

}
