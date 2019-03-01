package Polymorhism;

public class classRoom {

public int numberOfTables(int a, int v) {
	int total = a*v;
	return total;
	
}

public int numberofTables(int a, int e, int v) {
	int total = a + e*v;
	return total;
}

public int numberofTables(int a, int v, int e, int m) {
	int total = a + v + e + m;
    return total;
}
}
