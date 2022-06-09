package com.bd;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("enter number");
		int number = input.nextInt();
		
		for( int i=0; i<number; i++) {
			System.out.println("enter number " +i);
		}
			

	}

}
