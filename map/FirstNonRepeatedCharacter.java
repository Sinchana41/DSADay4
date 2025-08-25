package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input = "swiss";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Find the first character with frequency 1
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeated character: " + entry.getKey());
				return;
			}
		}

		System.out.println("No non-repeated character found.");
	}
}
