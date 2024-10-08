package javaPrograms;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class StringManipulation {

	public static void main(String[] args) {
		// How to do String Manipulation
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));//1st occurance of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//2nd occurance of s
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello"));//-1
		
		//String comparison:
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//Substring:
		System.out.println(str.substring(0,9));
		
		//Trim:
		String s = "  Hello World    ";
		System.out.println(s.trim());
		
		//Replace:
		System.out.println(s.replace(" ", ""));
		
		String date = "01-01-2024"; //01/01/2024
		System.out.println(date.replace("-", "/"));
		
		//Split
		String test = "Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for(int i = 0;i<testval.length; i++) {
			System.out.println(testval[i]);
		}
		
		//Concatenate
		String s2 = "Cares";
		System.out.println(s2.concat("s"));
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
	}

}
