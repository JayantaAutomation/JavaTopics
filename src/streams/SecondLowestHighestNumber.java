package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class SecondLowestHighestNumber {

	public static void main(String[] args) {
		// Get Second Highest/Lowest Number using Streams
		
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,0);
		
		//sec highest:
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secH);
		
		int secHH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secHH);
		
		//sec lowest:
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
	}

}
