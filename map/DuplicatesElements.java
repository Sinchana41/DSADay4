package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class DuplicatesElements {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 4, 2, 5, 8, 6, 4};

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Count occurrences
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Duplicate elements and their counts:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}
}
