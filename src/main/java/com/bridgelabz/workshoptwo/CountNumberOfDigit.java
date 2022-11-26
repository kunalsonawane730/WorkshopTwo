package com.bridgelabz.workshoptwo;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int num, totalDigitsCount=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = scan.nextInt();
	      
	      while(num!=0)
	      {
	         totalDigitsCount++;
	         num = num/10;
	      }
	      
	      System.out.println("\nThe Total Number of Digits = " +totalDigitsCount);
	      scan.close();
	   }
}
