package DataBaseStructures;

import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {
        Stack<String> use = new Stack(); // last in first out.
        use.add("NY");                  //
        use.add("PA");
        use.add("NJ");
        use.add("PA");

        System.out.println(use.peek());
        System.out.println(use.pop());
        System.out.println(use.push("Az")); // Ask for a specific string
        System.out.println(use.peek());

    }














}
