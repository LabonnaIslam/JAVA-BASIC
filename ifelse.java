package com.bd;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		

    Scanner input = new Scanner(System.in);
		
		
		System.out.print("enter number1");
		int number1 = input.nextInt();
		
		System.out.print("enter number2");
		int number2 = input.nextInt();
		
		if(number1>number2) {
			System.out.println("number1 "+number1+" is greater than number2 "+number2);
		}
		else if(number1==number2) {
			System.out.println("number1 "+number1+" is equal than number2 "+number2);
			
		}
		else {
			System.out.println("number1 "+number1+" is less than number2 "+number2);
			
		}
	}

}
