// Java program to demonstrate the
// working of a stack
import java.util.*;
public class p4 {
	
	// Main Method
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("1Geeks");
		stack.push("2For");
		stack.push("3Geeks");
		stack.push("4Geeks");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		System.out.print("Top : " + stack.pop() + "\n");

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

    
	}
}
