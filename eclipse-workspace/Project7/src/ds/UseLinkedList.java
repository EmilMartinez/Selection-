package Encapsulation;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
    List<String> list = new LinkedList<String>(); // LinkedList can only hold one string at a time. 
    
    list.add("NY");
    list.add("FL");
    list.add("DC");
    list.add("CA");
    
    Iterator it = list.listIterator();
    while(it.hasNext()) {
    System.out.println(list.n);
	
	}
	}

}
