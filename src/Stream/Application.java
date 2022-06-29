package Stream;

import java.util.ArrayList;

public class Application {
public static void main(String[] args) {
	ArrayList<String> developername=new ArrayList<>();
	developername.add("Mani");
	developername.add("Raja");
	developername.add("Jack");
	developername.stream().map(x->x.toUpperCase()).forEach(y->System.out.println(y));
	developername.stream().filter(z->z.contains("j")).forEach(s->System.out.println(s));
	long a= developername.stream().filter(z->z.contains("j")).count();
	System.out.println(a);
}
}
