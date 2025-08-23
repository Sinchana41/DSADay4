package org.collectionsusinginnbiltmethods.linkedlist;

import java.util.*;

public class PalindromeCheck {

	public static boolean isPalindrome(LinkedList<Integer> list) {
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			if (!list.get(left).equals(list.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		System.out.println(list1);//[1, 2, 3, 2, 1]
		System.out.println(isPalindrome(list1));//true
	}
}
