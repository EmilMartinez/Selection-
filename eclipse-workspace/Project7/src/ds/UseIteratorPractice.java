package ds;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class UseIteratorPractice {

	public static void main(String[] args) {
    List<String> list = new LinkedList<String>();
    
    list.add("Banna");
    list.add("Apple");
    list.add("Orange");
    list.add("Mango");
    list.add("Pom");
    
    Iterator it = list.ListIterator();// we are creating an object to be able to move via the list.
    while(it.hasNext()) {
    	System.out.println(it.next());
    }
    }

    
    
    
    
    
    
	}

}
