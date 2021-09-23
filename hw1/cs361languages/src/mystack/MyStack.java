/**
 * 
 */
package mystack;

/**
 * @author Cameron Sweeney 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if(theStack == null) {
			System.out.println("Cannot pop, stack is empty");
		}
		else {
			T v = theStack.val;
			theStack.val = theStack.next.val;
			theStack.next = theStack.next.next;
			System.out.println("Popping " + v);
		}
		return null;
	}

	public void push(T v) {
		// TODO To complete
		if(theStack == null) {
			theStack = new MyNode<T>(v, null);	
		}
		else {
			T temp = theStack.val;
			MyNode<T> newNext = new MyNode<T>(temp, null);
			theStack.next = newNext;
			theStack.val = v;			
		}
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.pop();
		intStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		MyStack<Person> personStack = new MyStack<Person>();
		Person p1 = new Person("Cameron", "Sweeney");
		Person p2 = new Person("Christelle", "Scharff");
		personStack.push(p1);
		personStack.push(p2);
	}

}
