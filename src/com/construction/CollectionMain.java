package com.construction;
import java.util.ArrayList;
public class CollectionMain {

	public static void main(String[] args) {

		ArrayList < Collection>  a = new ArrayList< Collection >();
		
		Collection c = new Collection("Mazda","Blue","Automatic",37000);
		Collection c1 = new Collection("Toyoya","Red","Manual", 34000);
		Collection c2 = new Collection ("Nissan","White","Sports",32000);
		Collection c3 = new Collection ("Honda", "Silver","Gear", 30000);
		
		a.add(c);
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		
		for(Collection collect: a) {
			System.out.println(collect.name);
 			System.out.println(collect.color);
 			System.out.println(collect.engine);
 			System.out.println(collect.price);
 			System.out.println("collect.next");
		}

	}

}
