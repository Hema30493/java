package ForLoopWithConditionDay11;

public class ArrayVowels {

	public static void main(String[] args) {
		String[] a= {"rrr","HELLO","ram","road"};
	
		
		for(int i=0;i<a.length;i++) {
			String b=a[i].toUpperCase();

				if (b.contains("A") ||  b.contains("E") || b.contains("I") || b.contains("O") || b.contains("U") ) {
					
					System.out.println(a[i]+" vowels contains");
				}
			
}

}

}
