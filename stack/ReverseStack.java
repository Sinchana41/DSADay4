package org.collectionsusinginnbiltmethods.stack;

import java.util.*;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Original Stack: " + stack);//[10, 20, 30, 40]
		reverseStack(stack);
		System.out.println("Reversed Stack: " + stack);//[40, 30, 20, 10]
	}

	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int top = stack.pop();          
		reverseStack(stack);           
		insertAtBottom(stack, top);    
	}

	private static void insertAtBottom(Stack<Integer> stack, int element) {
		if (stack.isEmpty()) {
			stack.push(element);
			return;
		}

		int top = stack.pop();             
		insertAtBottom(stack, element);      
		stack.push(top);                     
	}
}
