/**
 * Interface class that sets up the methods that are used in a Queue.
 */
public interface QueueInterface<T> {

	public void enqueue(T value);

	public T dequeue();

	public T getFront();
}
