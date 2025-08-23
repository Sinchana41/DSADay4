package org.collectionsusinginnbiltmethods.stack;

import java.util.*;

public class PostfixEvaluation {

	public static void main(String[] args) {
		String expression = "231*+9-"; 
		int result = evaluatePostfix(expression);
		System.out.println("Result: " + result);// 2 + (3*1) - 9 = -4
	}

	public static int evaluatePostfix(String expression) {

		Stack<Integer> stack = new Stack<>();
		for (char ch : expression.toCharArray()) {
			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int val2 = stack.pop();
				int val1 = stack.pop();

				switch (ch) {
				case '+': stack.push(val1 + val2); 
				break;
				case '-': stack.push(val1 - val2); 
				break;
				case '*': stack.push(val1 * val2); 
				break;
				case '/': stack.push(val1 / val2); 
				break;
				default: 
					System.out.println("Invalid operator: " + ch);				
				}
			}
		}
		return stack.pop();
	}
}
