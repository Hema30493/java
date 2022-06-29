package ForLoopWithConditionDay11;

public class Startswith {

	public static void main(String[] args) {
		String[] a= {"rrr","HELLO","ram","Road"};
	
		
		for(int i=0;i<a.length;i++) {
		

				if (a[i].startsWith("r") || a[i].startsWith("R") ) {
					
					System.out.println(a[i]+" startswith");
				}
			
}
	}

}
