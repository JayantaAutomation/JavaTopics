package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		//1.Reverse string by using for loop
		//Difference between String and StringBuffer
		//Do we have reverse function in String?
		
		String sr = "Selenium";//string length 0-7, i should start with len-1 i.e. 7
		
		System.out.println("Before Reversing = " + sr);
		
		int len = sr.length();//8
		String rev = "";//blank variable to store the value
		
		for (int i = len-1; i>=0; i--) {
			rev = rev+sr.charAt(i);//muineles
		}

		System.out.println("After reversing = " + rev);
		
		System.out.println("************************************");
		
		//2.Reverse string by using String Buffer class:
	
		System.out.println("Before Reversing = " + sr);
		StringBuffer sbf = new StringBuffer(sr);
		System.out.println("After Reversing = " +sbf.reverse());
	}

}
