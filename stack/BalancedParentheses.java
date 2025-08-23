package org.collectionsusinginnbiltmethods.stack;

import java.util.*;

public class BalancedParentheses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.next();//{[()]}
		boolean rs=isBalance(st);
		if(rs) {
			System.out.println("String is balanced");//String is balanced
		}else {
			System.out.println("String is not balanced");
		}
		sc.close();
	}

	static boolean isBalance(String st) {
		if(st.length()%2==1)
			return false;

		Stack<Character> s=new Stack<Character>();
		for (Character ch : st.toCharArray()){
			if(ch=='{'||ch=='('|| ch=='['){
				s.push(ch);
			}
			else{
				if(s.isEmpty()) {
					return  false;
				}

				Character pch=s.pop();
				if(ch=='}'&&pch!='{'||ch==')'&&pch!='('||ch==']'&&pch!='[') {
					return false;
				}
			}
		}
		return s.isEmpty();
	}
}
