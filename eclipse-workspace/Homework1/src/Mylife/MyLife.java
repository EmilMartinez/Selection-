package Mylife;

public class MyLife {

	float weight;
	int heights;
	int age;
	String name; 
	String city; 
	
	public void showname(){
	  System.out.println("My name is Emil");
	  
	}
	
	public void showcity() {
		System.out.println("I live in New York");
	
	}
	
	public int showheights(int d, int e) {
		this.heights = d; 
		System.out.println("My height is " + d + "'"+e);
		return d;
		
	}
	
	 public int showage(int a) {
		 this.age = a;
		 System.out.println("I am:" + age);
		 return age;
		 
	 }
	 
	
	 public float showweight(float s) {
		 this.weight = s;
		 System.out.println("I am " +s);
		 return s;
	 }
}





