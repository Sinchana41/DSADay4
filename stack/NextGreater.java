package org.collectionsusinginnbiltmethods.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int[] ar = {4,5,2,21};
		int[] rs=nextGreater(ar);
		System.out.println(Arrays.toString(rs));//[5, 21, 21, -1]
	}

	static int[] nextGreater(int[] ar) {

		int[] rs=new int[ar.length];
		Stack<Integer> st=new Stack<Integer>();

		for(int i=ar.length-1;i>=0;i--) {

			while(st.isEmpty()==false && st.peek()<=ar[i]) {
				st.pop();
			}
			rs[i]=st.isEmpty()?-1:st.peek();
			st.push(ar[i]);
		}
		return rs;
	}


}
