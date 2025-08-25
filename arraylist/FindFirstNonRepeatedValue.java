package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class FindFirstNonRepeatedValue {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println(list);//[40, 20, 10, 20, 40]

		Map<Integer, Integer> freqMap = new LinkedHashMap<>();

		for (int num : list) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		Integer firstNonRepeated = null;
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == 1) {
				firstNonRepeated = entry.getKey();
				break;
			}
		}

		if (firstNonRepeated != null) {
			System.out.println("First non-repeated element: " + firstNonRepeated);//10
		} else {
			System.out.println("No non-repeated element found.");
		}
	}
}
