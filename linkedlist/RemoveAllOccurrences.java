package org.collectionsusinginnbiltmethods.linkedlist;

import java.util.*;

public class RemoveAllOccurrences {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(10);
		list1.add(10);
		list1.add(30);
		System.out.println(list1);//[10, 20, 10, 10, 30]
		removeAllOccurrences(list1,10);
		System.out.println(list1);//[20, 30]

	}

	public static void removeAllOccurrences(LinkedList<Integer> list1, int key) {
		//if remove elements while iterating forword list will shift and we will miss next index
		for (int  i= list1.size()-1;  i>= 0; i--) {
			if(list1.get(i).equals(key)) {
				list1.remove(i);
			}
		}
	}
}
