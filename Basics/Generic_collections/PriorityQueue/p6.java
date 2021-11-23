// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class p6 {
	
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		// Printing the top element of PriorityQueue
		System.out.println("Top element :" + pQueue.peek() + "\n");

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println("Top element and removing it " + pQueue.poll() + "\n");

		// Printing the top element again
		System.out.println("Top element : " + pQueue.peek() + "\n");
	}
}
