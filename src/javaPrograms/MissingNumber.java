package javaPrograms;

/*
 * Author: Jayanta Kumar Panda
 * 
 */ 
public class MissingNumber {

	public static void main(String[] args) {
		
		 /*
		  * How to find missing number in an Array
		  * Algorithm
		  * 1+2+4+5 = 12
		  *	1+2+3+4+5 = 15
		  *	15-12 = 3
		  */

		int a[] = {1,2,3,4,6,7,8,9,10};
		int sum = 0;
		for(int i=0; i<a.length;i++){
			sum = sum +a[i];//1
		}
		System.out.println("Result of adding numbers w/o missing number::"+sum);
		
		int sum1 = 0;
		for(int j=0; j<=10; j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println("Result of adding numbers with missing number::"+sum1);
		System.out.println("Missing Number is::"+(sum1-sum));
	}

}
