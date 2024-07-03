package javaPrograms;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		// Logic1 - Third variable
		int t = a;
		a = b;
		b = t;
		System.out.println("Logic1 - After swapping values are.." + a + " " + b);

		// Logic2 - use + & - without using third variable
		a = a + b;// 10+20=30
		b = a - b;// 30-20=10
		a = a - b;// 30-10=20
		System.out.println("Logic2 - After swapping values are.." + a + " " + b);
		
		// Logic3 - Use * and /without using third variable
		// here a& b values should not be zero

		a = a * b; // 10*20=200
		b = a / b; // 200/20=10
		a = a / b; // 200/10=20
		System.out.println("Logic3 - After swapping values are.." + a + " " + b);
		
		// Logic4 - bitwise XOR (^)
		a = a ^ b; // 10^20 = 30
		b = a ^ b; // 30^20 = 10
		a = a ^ b; // 30^10 = 20
		System.out.println("Logic4 - After swapping values are.." + a + " " + b);
		
		// Logic5 - Single statement
		// a=10 b=20

		b = a + b - (a = b);

		System.out.println("Logic5 - After swapping values are.." + a + " " + b);

	}

}
