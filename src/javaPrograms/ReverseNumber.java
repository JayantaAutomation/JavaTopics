package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num=sc.nextInt(); //1234
		
		//1. Using algorithm
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 +num%10;
			num=num/10;
		}
		
		System.out.println("Reverse Number is: "+ rev);
		
		//2.Using StringBuffer method
		
		long num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
