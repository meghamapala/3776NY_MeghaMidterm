package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Camry");
		queue.add("Rav4");
		queue.add("Hilander");
		queue.add("4Runner");
		queue.add("Corolla");

		System.out.println("Peek as of now: " + queue.peek());
		System.out.println("Need to remove: " + queue.remove());
		System.out.println("Remove from  front  : " + queue.poll());
		System.out.println("********************");

		Iterator iterator = queue.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("********************");
		for (String toyota : queue
			 ) {
			System.out.println(toyota);
		}
	}
}
