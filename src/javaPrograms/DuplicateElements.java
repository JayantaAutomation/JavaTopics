package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Author: Jayanta Kumar Panda
 * 
 */
public class DuplicateElements {

	public static void main(String[] args) {
		// How to find out duplicates elements in Java Array?

		String names[] = { "Java", "JavaScript", "Ruby", "Python", "Java" };

		// 1. Compare each element: Time complexity 0(nxn) worst solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is::" + names[i]);
				}
			}
		}

		// 2. Using HashSet: Java Collection: It stores unique values: Time complexity
		// 0(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element by using HashSet is::" + name);
			}
		}

		// 3. Using HashMap: 0(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		//Get the values from this HashMap:
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element by using HashMap is::"+ entry.getKey());
			}
		}
		
	}

}
