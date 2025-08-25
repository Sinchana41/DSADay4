package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class WordOccurence {

	public static void main(String[] args) {
		String line = "count the number of occurrences of each word"; 

		Map<String, Integer> wordCount = new HashMap<>();
		String[] words = line.toLowerCase().split(" ");

		for (String word : words) {
			if (!word.isEmpty()) {
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}

		System.out.println("Word Occurrences:");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
