package Inheritance;

public class NYC {

public void population() {
	System.out.println("There are 12 million in this city");
}

public void Boroughs() {
	System.out.println("There 5 boroughs in this city.");
}

public void themostpopularborough() {
	System.out.println("Queens");
}

public String TheMayor(String DeBlasio) {
	String name = DeBlasio;
	System.out.println("The mayor of NYC is:" +name);
    return name;	
}



}
