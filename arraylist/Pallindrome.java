package org.collectionsusinginnbiltmethods.arraylist;

import java.util.ArrayList;

public class Pallindrome {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(40);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println(list);//[40, 20, 10, 20, 40]

		int i=0;
		int j=list.size()-1;
		while(i<j) {
			if(list.get(i)!=list.get(j)){
				System.out.println("Not a pallindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("pallindrome");
	}
}