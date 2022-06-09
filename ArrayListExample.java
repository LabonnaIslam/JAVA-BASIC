package com.bd;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();		

		 names.add("name1");
		 names.add("name2");
		 names.add("name3");
		 names.add("name4");
		 names.add("name5");
		 //System.out.println(names);
		 System.out.println(names.size());
		 System.out.println(names);
		 
		// names.remove(2);
		 System.out.println(names);
		 System.out.println(names.get(1));
     //	 for(int i=0; i<names.size() ; i++) {
//		 System.out.println(names.get(i));
			 
//		 }
		    
		 //foreach loop
		 for(String value : names) {
			 System.out.println(value);
		 }
	
	}
	}
