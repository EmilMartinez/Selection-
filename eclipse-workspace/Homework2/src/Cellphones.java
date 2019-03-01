
public class Cellphones {

public String cellNames;
public int cellSize;
public double memorySize;
public float cellweight;
public boolean isItPhone;

public Cellphones (String cellNa) {
	this.cellNames = cellNa;
	System.out.println(cellNames);
}

public Cellphones (int cellSi) {
	this.cellSize = cellSi;
	System.out.println(cellSi);
}

public Cellphones (double memorySi ) {
	this.memorySize = memorySi;
	System.out.println(memorySi);
}

public Cellphones (float cellWe) {
	this.cellweight = cellWe;
	System.out.println(cellWe);
}

public Cellphones (boolean isTph) {
	this.isItPhone = isTph;
	System.out.println(isTph);
}



}
