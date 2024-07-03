package javaPrograms;

public class PrintOneToHundred {

	public static void main(String[] args) {
		
		/*
		 * Output numbers from 1...100
		 * Without using any numbers in your code.
		 * 
		 * 	for (int i = 0; i<=100; i++) {
			System.out.println(i);
		 */
		
		int one = 'A'/'A';//1
		String s1 = "..........";
		
		for (int i=one; i<=(s1.length()*s1.length()); i++) {
			System.out.println(i);
		}
		
		System.out.println("============================================");
		//a-97 b-98 c 99 d 100
		for (int i=one; i<='d';i+=one) {
			System.out.println(i);
		}
		
	}

}
