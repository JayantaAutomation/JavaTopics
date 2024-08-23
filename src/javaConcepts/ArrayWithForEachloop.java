package javaConcepts;

public class ArrayWithForEachloop {

	public static void main(String[] args) {

		// for-each loop for single dimensional array
		int[] c = { 77, 66, 55, 44, 33, 22, 11 };

		for (int temp : c) {
			System.out.println(temp);
		}
	}
}
