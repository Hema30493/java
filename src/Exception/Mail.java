package Exception;

public class Mail {
	public static void main(String[] args) {
		String a="hemagmail.com";
		try {
		
		if(!a.contains("@")) {
			throw new MailException("Mail is not valid");
		}
		else {
			System.out.println("mail is valid");
		}
		} catch(MailException m) {
			m.printStackTrace();
		}
		System.out.println("Somthing");
	}

}
