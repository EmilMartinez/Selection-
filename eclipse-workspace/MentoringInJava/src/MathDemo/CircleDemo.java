package MathDemo;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius,area;
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		sc.close();
		area=3.1416*radius*radius; 
		System.out.println("Area of Circle" +area);

	}

}
