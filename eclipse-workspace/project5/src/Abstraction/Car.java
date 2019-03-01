package Abstraction;

public interface Car {

public void Seats();
public void Wheels();
public void Mirrors();
public void PushToStart();
public void HeadLights();
public void SteeringWheel();


  
  public static void  carBody() {
	System.out.println("Car body must be strong enough to drive in hightway");  
  }// the only way a interface class can define a method is via a static method. 
}	
