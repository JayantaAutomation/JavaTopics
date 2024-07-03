package streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {

	public static void main(String[] args) {

		//Print Average of All Numbers
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2);
		
		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Avg is : "+avg);
	}

}
