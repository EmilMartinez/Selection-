package Inheritance;

public class Testofcities {

	public static void main(String[] args) {
    LasVegas newEea = new LasVegas();
    newEea.TheMayor("Sanchez");
    newEea.Casinonumber(500);
    newEea.population();
    newEea.themostpopularborough();
    
    
    DC congress = new DC();
    congress.Boroughs();
    congress.themostpopularborough();
    congress.TheMayor("Trump");
    congress.numberofcouncilmen(500);
	}

}
