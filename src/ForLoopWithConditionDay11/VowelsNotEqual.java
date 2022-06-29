package ForLoopWithConditionDay11;

public class VowelsNotEqual {



	public static void main(String[] args) {
		String a="Shashwanth";
		char[] b=a.toCharArray();
		
		for(int i=0;i<b.length;i++) {
			if (b[i]!='a'|| b[i]!='e' || b[i]!='i' || b[i]!='o' || b[i]!='u') {
				
				System.out.println("not contains");
			}
		}
	
	}

}
