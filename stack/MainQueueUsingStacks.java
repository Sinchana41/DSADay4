package org.collectionsusinginnbiltmethods.stack;

public class MainQueueUsingStacks {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.dequeue()); // 10
		System.out.println(queue.peek());    // 20
		System.out.println(queue.dequeue()); // 20
		System.out.println(queue.isEmpty()); // false
	}
}
