package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {

		// 01 - Print Sum Of All numbers

		List<Integer> list = Arrays.asList(1, 4, 5, 6, 4);
		
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		
		System.out.println("Sum of numbers: " +sum.get());
	}

}
