/**
 * A class that represents a generic linked list that also implements a queue.
 * 
 * @author Jose Garcia Balboa
 *
 * @param <T>
 */
public class LinkedListQueue<T> implements QueueInterface<T> {

	/**
	 * A Node class that is used within a LinkedList.
	 *
	 * @param <T>
	 */
	private class Node<T> {
		T data;
		Node<T> nextNode;

		Node(T data, Node<T> nextNode) {
			this.data = data;
			this.nextNode = nextNode;
		}
	}

	private int increase;
	private Node<T> head;
	private Node<T> tail;

	public LinkedListQueue() {
		head = tail = null;
		increase = 0;
	}

	/**
	 * This method adds a particular element to a queue, and also makes it the first
	 * entry. one.
	 */

	public void enqueue(T value) {
		if (tail != null) {
			tail.nextNode = new Node<T>(value, null);
			tail = tail.nextNode;
		}

		else {
			tail = new Node<T>(value, null);
			head = tail;
		}

		increase++;
	}

	/**
	 * This method removes the first element in a queue. If the queue is empty, an
	 * exception will be thrown.
	 */
	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("The Queue is empty, you cannot dequeue at this time.");
		}

		T value = head.data;
		head = head.nextNode;
		increase--;

		if (head == null) {
			tail = null;
		}

		return value;
	}

	/**
	 * This method is used to check and see if the queue is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * This method is used to return the first entry in the queue.
	 * 
	 * @return
	 */
	public T getFront() {
		if (isEmpty()) {
			throw new IllegalStateException(
					"The Queue is empty, you cannot return the first entry of the queue at this time.");
		}

		T value = head.data;

		return value;
	}
}