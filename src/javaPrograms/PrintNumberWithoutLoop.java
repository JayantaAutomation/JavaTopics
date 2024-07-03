package javaPrograms;

import java.util.stream.IntStream;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {

		/*
		 * Print 1 to 100 without using any loop 1) Recursive function 2) Java streams
		 * 
		 */
		// printNum(1);
		//printNumber(1, 100);
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);// 1 2 3 4....100
			num++;
			printNum(num);
		}
	}

	public static void printNumber(int stnum, int endNum) {
		if (stnum <= endNum) {
			System.out.println(stnum);// 1 2 3 4....100
			stnum++;
			printNumber(stnum, endNum);
		}
	}
}
