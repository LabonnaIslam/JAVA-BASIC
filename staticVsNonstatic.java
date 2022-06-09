package com.bd;

public class staticVsNonstatic {
	
	static int num=20;
	 int num1=30;
	

	public static void main(String[] args) {
		System.out.println(num);
		//ClassName objName = new ClassName()
		staticVsNonstatic obj = new staticVsNonstatic();
	    System.out.println(obj.num1);
	    obj.nonstatic();
		

	}
	public void nonstatic()
	{
		System.out.println(num);
		System.out.println(num1);
	}
	static{
		System.out.println("static run...");
	}

}
