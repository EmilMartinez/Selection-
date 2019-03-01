package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ReadMyFiles {
	// first try is to see if it can find it, second is to see if read it.
	// if else, just in case it doesn't exist.
	// assigning st as an empty string to use it on line 23. 
	
	public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;
    String path = "C:\\Users\\emilm\\OneDrive\\Documents";
    try {
    	fr = new FileReader(path);
    	br = new BufferedReader(fr);
    } catch (FileNotFoundException e) { 
   	e.printStackTrace();
    }
    String st = " "; 
    try {
    	 
    	while ((st = br.readLine())!= null) {
    		System.out.println(st); 
    	} 
    	
    	}catch (Exception ex) {
    		ex.printStackTrace();
    }
	}
}
	