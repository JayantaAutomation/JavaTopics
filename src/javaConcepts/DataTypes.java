package javaConcepts;

public class DataTypes {

	public static void main(String[] args) {
		
		//data types: the type of data
		//primitive data types
		//Integer family: byte, short, long int
		//floating family: double, float
		//character: char
		//boolean: boolean - true/false
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		
		byte b = 10;//allocation
		b = 20;
		byte b1 = 0;
		byte b2 = -10;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
			
		//2. short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s = 10;
		//10 vars --> 10 bytes / 20 bytes
		
		//3.int:
		//size: 4 bytes = 32 bits
		//range:-2^31 to 2^32-1
		int i = 10;
		int i1 = -10;
		int p = 1000;	
		int l = 0;
		
		//4. long:
		//size: 8 bytes = 64 bits
		long ph = 999999;
		long distance = 132425543;
		long e = 10;
		System.out.println(distance);
		
		//5.float:
		//size: 4 bytes = 32 bits
		//range: after point it can take upto 6 to 7 digits
		float f = 12.33f;
		float g = (float)34.44;
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after point it can take upto 15 digits
		double d = 12.8888;
		double d1 = -15.7777;
		double d3 = 200;
		
		//7. char:
		//size: 2 bytes: 16 bits
		char c = 'a';
		char c1 = '2';
		char c2 = '#';
		char gender = 'f';
		
		//8. boolean:
		//size: ~1 bit
		boolean flag = true;
		boolean flag1 = false;
		
		System.out.println(flag);
		
		
		
		
		
		
		
		
		
		

	}

}
