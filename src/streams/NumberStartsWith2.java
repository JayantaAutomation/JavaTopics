package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class NumberStartsWith2 {

	public static void main(String[] args) {
	
		
		//Print Numbers Starts With Prefix 2 using Streams
		
		List<Integer> numbers = Arrays.asList(2, 222, 234, 567, 890, 432, 236, 211, 22);
		
		List<Integer> numWith2 = numbers.stream()
					.map(e -> String.valueOf(e))
							.filter(e -> e.startsWith("8"))
									.map(Integer::valueOf)
										.collect(Collectors.toList());
		
		System.out.println(numWith2);
		
	} 

}
