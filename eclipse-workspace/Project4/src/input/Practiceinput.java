package input;

import java.util.Scanner; 

public class Practiceinput {

	public static void main(String[] args) {
	   System.out.println("What is your favorite city?");
	   Scanner sc = new Scanner(System.in);
	   String City = sc.nextLine();
	   System.out.println("My favorite city is:" +City);
	   sc.close();
	}
}