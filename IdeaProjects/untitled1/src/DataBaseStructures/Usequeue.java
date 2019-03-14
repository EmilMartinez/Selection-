package DataBaseStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Usequeue { //First in, First out.

    public static void main(String[] args) { //
     Queue<String> berealistic = new LinkedList<String>();
     berealistic.add("New York");
     berealistic.add("Boston");
     berealistic.add("Florida");
     berealistic.add("California");

        System.out.println(berealistic.peek()); // First one top element
        System.out.println(berealistic.remove()); // afterwards I move to the next one.
        System.out.println(berealistic.peek());



    }





}
