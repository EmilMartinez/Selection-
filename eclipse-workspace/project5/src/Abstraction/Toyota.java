package Abstraction;

public class Toyota extends MotorVehicle implements Car {
	
	public void Seats() {
		System.out.println("The seats in the car are leather.");
		}
		
		public void Wheels() {
			System.out.println("The wheels of the car are 16'inhes high.");
		}
		
		public void Mirrors() {
			System.out.println("The mirrors of the car are tinted.");
		}
		
		public void PushToStart() {
			System.out.println("The push to start button is near the steering wheel.");
		}
		
		public void HeadLights() {
			System.out.println("The Head lights of the car are LED.");
		}
		
		public void SteeringWheel() {
			System.out.println("The steering wheel is very soft and easy to manuever.");
		}
		
	    public void MPG() {
	    System.out.println("This car gives 32 MPG on the highway");
	    }
	    
	    public String CarName(String carName) {
	    	String total = carName;
	    System.out.println("The car name is:" +total);
	    return total;
	    }
			
		
		
	}


	
	