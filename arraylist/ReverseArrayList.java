package org.collectionsusinginnbiltmethods.arraylist;

import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);//[10, 20, 30, 40, 50]
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for (int i = list.size()-1; i >=0; i--) {
			list1.add(list.get(i));		
		}
		System.out.println(list1);//[50, 40, 30, 20, 10]
	}
}
