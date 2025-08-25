package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class RemoveDuplicatesAndMaintainOrder {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 40, 30, 50, 20));

		System.out.println("Original List: " + list);//[10, 20, 30, 10, 40, 30, 50, 20]
		removeDuplicates(list);
		System.out.println("After Removing Duplicates: " + list);// [10, 20, 30, 40, 50]
	}

	public static void removeDuplicates(ArrayList<Integer> list) {
		Set<Integer> set = new LinkedHashSet<>(list); // removes duplicates, keeps order
		list.clear();
		list.addAll(set);
	}
}
