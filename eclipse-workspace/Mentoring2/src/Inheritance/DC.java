package Inheritance;

public class DC extends NYC {

	public void population() {
		System.out.println("There are 12 million in this city");
	}
	
	public void Boroughs() {
		System.out.println("There 5 boroughs in this city.");
	}
	
	public String TheMayor(String DeBlasio) {
		String name = DeBlasio;
		System.out.println("The mayor of NYC is:" +name);
	    return name;	
	}
	
public int numberofcouncilmen(int c) {
	int total = c;
	System.out.println("the total number of council men in this city:" +total);
	return total;
}
	
	
}
