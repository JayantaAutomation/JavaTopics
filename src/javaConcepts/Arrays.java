package javaConcepts;

/*
 * 
 * Author: Jayanta Kumar Panda
 * 
 */
public class Arrays {

	public static void main(String[] args) {
		
		
		//  Declare, Create, Assign and Access Arrays
		
		int[] a = new int[3]; // Declaration and creation
		
		//Assign the value
		
		a[0] = 5;
		a[1] = 2;
		a[2] = 9;
		
		//Access or Retrieve the assigned values
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("The size of the array is: "+ a.length);
		System.out.println("*************");
		//Shortcut representation of single dimensional arrays
		
		int[] b = {9,6,3,8,2};
		/*
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);*/
		System.out.println("The size of the array is: "+ b.length);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
