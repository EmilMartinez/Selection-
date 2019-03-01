package Ifelsepractice;

public class Mainifelse {

	int x = 10;
	int y = 12;
	int z = 3;
	
	if (x > y) {
		System.out.println("This");
	} else {
		System.out.println("That");
	}

    if (x < z) { 
    	System.out.println("One");
    }else if (y <z) {
    	System.out.println("Two");
    } else if (x + y < z) {
    	System.out.println("Three");
    } else {
    	System.out.println("Four");
    }


boolean pigsCanFly = false; 
boolean humanCanFly = false;
boolean planesCanFly = true;
boolean birdsCanFly = true;

if (planesCanFly && humansCanFly) {
	System.out.println("Crazy");
} else {
	System.out.println("Common Sense");
}

for (int i = 0; i < 5; i++) {
	System.out.println("Hello World!");
}

// int i = 0, 0 < 5, prints Hello World, i++
// int i = 1, 1< 5, prints Hello World, i++

for (int i = 0; i < 2; i++) {
	for (int j = 0; j<5; j++) {
		System.out.println("printed from the inner for loop");
	}
	System.out.println("printed from the outer for loop\n");
}

// i = 0, 0 < 2, j = 0, 0 < 5 inner for loop (x5)
// print out outter loop 



}
    
}
}