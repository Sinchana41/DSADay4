package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class CommonElementsbetweenTwoList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);

		System.out.println("List 1: " + list1);//[10, 20, 30, 40]
		System.out.println("List 2: " + list2);// [30, 40, 50, 60]

		// Using retainAll we can get common elements
		ArrayList<Integer> commonElements = new ArrayList<>(list1);
		commonElements.retainAll(list2);

		System.out.println("Common Elements: " + commonElements);//[30, 40]
	}
}
