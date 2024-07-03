package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class LimitNumbers {

	public static void main(String[] args) {
		// Get first 5 numbers ---> sum of 5 numbers
		
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,40,19,3,0);
		
		List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		int sum = list.stream().limit(5).reduce((p,q) -> p+q).get();
		System.out.println(sum);
		
		//skip first 5 numbers:
		List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(sk);
		
		//skip first 5 numbers and give the sum of rest numbers
		int sumk = list.stream().skip(5).reduce((p,q) -> p+q).get();
		System.out.println(sumk);
	}

}
