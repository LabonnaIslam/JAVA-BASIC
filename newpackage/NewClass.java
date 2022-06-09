package com.bd.newpackage;

import com.bd.ParentInherit;

public class NewClass extends ParentInherit {

	public static void main(String[] args) {
		add(10,11);
		add(10,11);
		add(10,11);
		add(10,11);
		add(10,11);
		
		String name="java";
		String name1= "css";
		
		if(name.equals(name1)) {
			System.out.println("equal");
		}
		
		else {
			System.out.println(" not equal");
			
		}
		
		String name2="java";
		String name3= "JAVA";
		
		if(name2.equalsIgnoreCase(name3)) {
			System.out.println("equal");
		}
		
		else {
			System.out.println(" not equal");
		}
				
				

	}

}
