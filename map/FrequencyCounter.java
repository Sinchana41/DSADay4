package org.collectionsusinginnbiltmethods.map;

import java.util.*;

public class FrequencyCounter {

	public static void main(String[] args) {
		String string="Sinchana";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();

		for (Character ch: string.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}
}
