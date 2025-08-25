package org.collectionsusinginnbiltmethods.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SmallBigArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		System.out.println(list);//[40, 20, 10, 50, 30]

		Collections.sort(list);
		System.out.println("Smallest Element: "+list.get(0));//10
		System.out.println("Biggest Element: "+list.get(list.size()-1));//50
	}
}