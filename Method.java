package com.bd;

import java.util.Scanner;

  public class Method {
	 static void Summation(int num1,int num2) {
	 int sum=num1+num2;
	 int sum1=num1-num2; 
	 System.out.println("total :" +sum1);
	 System.out.println("total :" +sum);}
	 
	 static void conditon(int number1, int number2) {
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

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			
			
			System.out.print("enter number1");
			int number1 = input.nextInt();
			
			System.out.print("enter number2");
			int number2 = input.nextInt();
			
		 Summation(number1,number2);
			conditon(number1,number2);
			
			int x=10;
			
			if(x>20) {
				System.out.print("if statement");
			}
			else {
				System.out.print("else statement");
			}
		

	}

}
