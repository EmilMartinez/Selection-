package ds;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) { // last in first out!
     Stack<String> stack = new Stack<String>(){ // created a new object to call upon a stack. 
     stack.add("NY"); 
     stack.add("Pa");
     stack.add("FL");
     stack.add("CA");
     
	System.out.println(stack.peek());
	System.out.println(stack.pop());// popping from the stack.
	System.out.println(stack.push("Az"));// Asking for the specific Stack name. 
	System.out.println(stack.peek());
     

     }
	
