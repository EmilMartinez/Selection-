package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FilereaderExample {

	public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;
	//
    fr = new FileReader(path);// creating an object
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	br = new BufferedReader(fr);
	String st = "";
	try {
		while ((st = br.readline()! = null) {
		System.out.println(st);
		}
		}
	
	
	
	
	
	
	
	}

}
