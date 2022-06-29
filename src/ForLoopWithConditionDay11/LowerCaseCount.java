package ForLoopWithConditionDay11;

public class LowerCaseCount {


	public static void main(String[] args) {
		String a="ShAsHWaNTh";
		String b=a.toLowerCase();
		int count=0;
		for(int i=0;i<a.length();i++) {
			if (a.charAt(i)==b.charAt(i)) {
				count++;
				System.out.println(b.charAt(i));
			}
			else {
				System.out.println(a.charAt(i));
			}
		}
		System.out.println("lowercasecount "+count);
	}

}
