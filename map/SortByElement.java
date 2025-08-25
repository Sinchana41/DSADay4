package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class SortByElement {

	public static void main(String[] args) {
		// Create a sample HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 5);
		map.put("Banana", 2);
		map.put("Mango", 8);
		map.put("Orange", 3);

		System.out.println("Original Map: " + map);

		// Convert HashMap to List of Map Entries
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

		// Sort the list by values in ascending order
		Collections.sort(entryList, Map.Entry.comparingByValue());

		// Create LinkedHashMap to maintain the sorted order
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("Map Sorted by Values: " + sortedMap);
	}
}
