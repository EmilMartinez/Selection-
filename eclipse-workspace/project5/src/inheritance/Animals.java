package inheritance;

public class Animals {
int lifespan = 5; 
String speciesType = null;

public Animals() {
	this.speciesType = "animal";
	
}
	
	public void eat() {
		System.out.println("Animal eats");
	}
	
	public void breath() {
		System.out.println("Animals breathes");
		
	}
}
