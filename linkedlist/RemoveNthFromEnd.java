package org.collectionsusinginnbiltmethods.linkedlist;

import java.util.*;

public class RemoveNthFromEnd {

	public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
		if (n <= 0 || n > list.size()) {
			System.out.println("Invalid value of n");
			return;
		}
		int indexFromStart = list.size() - n; // Calculate index from the start
		list.remove(indexFromStart); 
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Original List: " + list);//[10, 20, 30, 40, 50]
		
		removeNthFromEnd(list, 2); 
		System.out.println("After Removing 2nd node from end: " + list);//[10, 20, 30, 50]
	}
}
