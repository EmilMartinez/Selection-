package testing;

public class Math {
   
	//method 1 return method  
	public int addition(int a, int b) {
		int c = a + b;
		System.out.println ("the total is: " +c); 
		return c; 
		}
	
	public int multiplication (int a, int b) {
		int total = a*b;
		System.out.println ("the total is: "+ total); 
		return total;
		
	}
	
	public int subtraction ( int a, int b) {
		int c = a - b; 
		System.out.println ("the total is "+c);
		return c; 
	}
	
	public int divison (int a, int b) {
		int c = a/b;
		System.out.println ("the total is: "+c);
		return c; 
	}
		
	//	static void main(String[] args) {
	//}
		// TODO Auto-generated method stub

	

}
