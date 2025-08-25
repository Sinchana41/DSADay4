package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class SortArrayList  {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		System.out.println(list);//[40, 20, 10, 50, 30]

		Collections.sort(list,((a,b)-> a-b));
		System.out.println(list);//[10, 20, 30, 40, 50]
	}
}