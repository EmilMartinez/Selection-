package ds;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue { // helps out out data in first in, First out. 

	public static void main(String[] args) {		
     Queue<String> queue = new LinkedList<String>();
     queue.add("NY");
     queue.add("PA");
     queue.add("NJ");
     queue.add("FL");
     queue.add("FL");
     
     System.out.println(queue.peek());// First one top element. 
     System.out.println(queue.remove());// afterwards we remove the next one;
     System.out.println(queue.peek());// 
	}

}
