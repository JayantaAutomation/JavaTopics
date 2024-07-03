package javaPrograms;

public class RemoveWhitespace {

	public static void main(String[] args) {

		// Remove White Space/Junk characters using Replace method
		String Str = "$$$$This %%%is &&&a ((test #####string";

		System.out.println("Before removing white space = " + Str);

		Str = Str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println("After removing white space = " + Str);

		// Remove White Space Without using Replace

		String s = "This is a test, please ignore";

		System.out.println("Before removing white space = " + s);

		for (char c : s.toCharArray()) {
			if (c != ' ')
				System.out.print(c);
		}

	}

}
