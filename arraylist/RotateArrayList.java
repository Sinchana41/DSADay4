package org.collectionsusinginnbiltmethods.arraylist;

import java.util.ArrayList;

public class RotateArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int k=2;
		System.out.println(list);//[10, 20, 30, 40, 50]
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for (int i = k; i<list.size(); i++) {
			list1.add(list.get(i));		
		}
		for (int i = 0; i<k; i++) {
			list1.add(list.get(i));		
		}
		System.out.println(list1);//[30, 40, 50, 10, 20]
	}
}
