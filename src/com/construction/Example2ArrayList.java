package com.construction;
import java.util.ArrayList;

public class Example2ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>a1 = new ArrayList<Integer>();
		
		a1.add(3);
		a1.add(5);
		a1.add(6);
		
		
		for(Integer i:a1)
		{
			System.out.println(i);
		}
	}

}
