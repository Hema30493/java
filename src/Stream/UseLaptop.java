package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 45000, "i5");
		Laptop l2 = new Laptop("Lenovo", 78000, "i7");
		Laptop l3 = new Laptop("Acer", 35000, "i3");
		Laptop l4 = new Laptop("Hp", 55000, "i5");
		ArrayList<Laptop> laptopDetails = new ArrayList<>();
		laptopDetails.add(l1);
		laptopDetails.add(l2);
		laptopDetails.add(l3);
		laptopDetails.add(l4);
//		laptopDetails.stream().map(x->x.getprice()+((x.getprice()*18)/100)).forEach(y->System.out.println(y));
//
//		laptopDetails.stream().filter(s->s.getprocessor().equals("i5")).forEach(z->System.out.println(z.getbrand()));
//		
//		long a=laptopDetails.stream().count();
//		System.out.println(a);

//		List<Integer> a1 = laptopDetails.stream().map(x -> x.getprice() + ((x.getprice() * 18) / 100))
//				.collect(Collectors.toList());
//		a1.forEach(y -> System.out.println(y));

		//List<String> a2 = laptopDetails.stream().filter(s -> s.getprocessor().equals("i5")).map(x->x.getbrand()).collect(Collectors.toList());
		//a2.forEach(z -> System.out.println(z.length()));
		//System.out.println(a2);
		List<Boolean> a3 = laptopDetails.stream().map(m-> m.getbrand().startsWith("A")).collect(Collectors.toList());
		System.out.println(a3);
		//a3.forEach(y -> System.out.println(y));

//		List<String> a4 = laptopDetails.stream().filter(s -> s.getprice()<=50000).map(y->y.getbrand().toUpperCase()).collect(Collectors.toList());
//		a4.forEach(z -> System.out.println(z));

	}

}
