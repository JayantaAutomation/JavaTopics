 package javaPrograms;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringSwap {

	public static void main(String[] args) {
		// How to swap 2 Strings without using temp/third variable
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping: ");
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		
		//1. append a and b:
		a = a+b;
		
		//2. Store initial string a in string b:
		b = a.substring(0, a.length()-b.length());
		
		//3. Store initial string b in string a:
		a = a.substring(b.length());		
		
		System.out.println("After swapping the value of a and b: ");
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);

	}

}
