package com.construction;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList < Customer>  a = new ArrayList< Customer >();
		
		Customer c = new Customer("shyam","add1",999,1);
		Customer c1 = new Customer("tony","add2",887,10);
		Customer c2 = new Customer ("John", "add3", 876,15);
		Customer c3 = new Customer("Mike", "add4", 678,20);
		
		a.add(c);
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		
 		for (Customer cust: a) {
 			System.out.println(cust.address);
 			System.out.println(cust.name);
 			System.out.println(cust.phomenumber);
 			System.out.println(cust.wallet);
 			System.out.println("cust.next");
 		}
 		
 			
		
		
	}

}
