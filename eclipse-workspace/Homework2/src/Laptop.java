
public class Laptop {
public String laptopSeries; 
public float laptopSize;
public int laptopWeight; 
public char laptopSign; 

public Laptop () {}

public Laptop (String laptopSer) {
	this.laptopSeries = laptopSer;
	System.out.println(laptopSeries);
}
public Laptop (int laWeight) {
	this.laptopWeight = laWeight;
	System.out.println(laptopWeight);
	
}

public Laptop (char laSign) {
	this.laptopSign = laSign;
	System.out.println(laptopSign);
}

public Laptop (float laSize) {
	this.laptopSize = laSize;
	System.out.println(laptopSize);
}
}
 