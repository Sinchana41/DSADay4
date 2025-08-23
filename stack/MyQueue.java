package org.collectionsusinginnbiltmethods.stack;

import java.util.*;

public class MyQueue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public MyQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void enqueue(int x) {

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		stack1.push(x);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public int dequeue() {
		if (stack1.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return stack1.pop();
	}

	public int peek() {
		if (stack1.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return stack1.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty();
	}
}
