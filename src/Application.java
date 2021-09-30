import java.util.Scanner;

/**
 * A class that is used to test different methods from a queue.
 */
class Application {

	public static void main(String args[]) {

		QueueInterface<String> myQueue = new LinkedListQueue<>();

		Scanner scan = new Scanner(System.in);

		String name;

		String name2;

		System.out.println(
				"Enter a string into the queue! After you enter a string, you can do one of 4 things:\n Type 1 to dequeue AND show the first entry in the queue\n Type 2 to show the first entry in the queue\n Type 3 to stop this program\n Type any other number to keep going\n \n (You can also press Enter instead of putting in a string if you'd like)\n");

		do {
			name = scan.nextLine();
			name2 = scan.nextLine();
			myQueue.enqueue(name);
			if (name2.equals("1")) {

				myQueue.enqueue(myQueue.dequeue());
				System.out.println(myQueue.getFront());
			}
			if (name2.equals("2")) {

				System.out.println(myQueue.getFront());
			}
		} while (!name2.equals("3"));

	}
}
