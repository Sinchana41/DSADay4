package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class RemoveDuplicatesElements {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 40, 30, 50, 20));

		System.out.println("Original List: " + list);//[10, 20, 30, 10, 40, 30, 50, 20]
		Set<Integer> duplicates = findDuplicates(list);//[20, 10, 30]

		System.out.println("Duplicate Elements: " + duplicates);
	}

	public static Set<Integer> findDuplicates(ArrayList<Integer> list) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (Integer num : list) {
			if (!seen.add(num)) {  // if add() returns false, it's a duplicate
				duplicates.add(num);
			}
		}

		return duplicates;
	}
}
