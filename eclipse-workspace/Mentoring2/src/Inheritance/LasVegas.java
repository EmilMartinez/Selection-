package Inheritance;

public class LasVegas extends DC {
	
public int numberofcouncilmen(int c) {
		int total = c;
		System.out.println("the total number of council men in this city:" +total);
		return total;
}

public String TheMayor(String DeBlasio) {
	String name = DeBlasio;
	System.out.println("The mayor of NYC is:" +name);
    return name;	
}

public int Casinonumber(int v) {
	int total = v;
	System.out.println("the total number of casinos in Vegas is:" +total);
	return total;
}
}
