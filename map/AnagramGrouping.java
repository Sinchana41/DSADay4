package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class AnagramGrouping {

	public static void main(String[] args) {
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

		Map<String, List<String>> anagramMap = new HashMap<>();

		for (String word : words) {
			
			char[] charArray = word.toCharArray();
			Arrays.sort(charArray);

			String key = new String(charArray);

			anagramMap.putIfAbsent(key, new ArrayList<>());
			anagramMap.get(key).add(word);
		}

		for (List<String> group : anagramMap.values()) {
			System.out.println(group);
		}
	}
}
