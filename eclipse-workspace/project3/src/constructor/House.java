package constructor;

public class House {
public String address;
public float size;  

   //constructor - 1
   public House(String add) {
	   this.address = add; 
	   System.out.println(address); 
   }
   
   //constructor - 2 
   public House(float size) {
     this.size = size; 
     System.out.println(size);
    }
   
   // public House () {}

	public House (String addr, float si) {
	 this.address = addr;
	 this.size = si;
	 System.out.println(addr + si);
	}

   public void setaddress(String address) {
		this.address = address; 
        System.out.println(address);
   }
	
	public void displayAdress() {
		System.out.println(this.address); 
	}
		
	}
