package CollectionArrayList;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList <String> brands=new ArrayList<>();	
		brands.add("cello");
		brands.add("natraj");
		brands.add("camlin");
		brands.add("rorito");
		brands.add("Renolds");
		//for(int i=0;i<brands.size();i++) {
			//char lastLetter=brands.get(i).charAt(brands.get(i).length()-1);
			//System.out.println(lastLetter);
		//}
//		String a="";
//		for(String brand: brands) {
//		a=a.concat(brand);
//	}
//		System.out.println(a);
//
//		Integer max=0;
//		String length="";
//		for(String brand: brands) {
//			if(brand.length()>max) {
//				max=brand.length();
//				length=brand;
//			}
//		}
//				System.out.println(length);

		brands.forEach(brand->System.out.println(brand));
	
	}	
}
