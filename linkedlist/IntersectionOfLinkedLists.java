package org.collectionsusinginnbiltmethods.linkedlist;

import java.util.*;

public class IntersectionOfLinkedLists {

	public static <T> T findIntersection(LinkedList<T> list1, LinkedList<T> list2) {
		Set<T> set = new HashSet<>(list1);//convert one list to set
		for (T element : list2) {
			if (set.contains(element)) {
				return element; 
			}
		}
		return null; 
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(70, 80, 30, 90));

		Integer intersection = findIntersection(list1, list2);

		if (intersection != null) {
			System.out.println("Intersection point: " + intersection);//30
		} else {
			System.out.println("No intersection found");
		}
	}
}
