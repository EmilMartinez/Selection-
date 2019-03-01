package ds;

import java.util.HashMap;// This import option comes from Java, when I write HashMap. 
import java.util.Map;// This import comes from Java, when I write Map.
import java.util.Map.Entry;//This import comes from Java, I write Map Entry way. 

public class HashMapPractice {

	public static void main(String[] args) {
    Map<String, String> views =  new HashMap<String,String>();// It must always be "Map" and "HashMap"
    views.put("USA", "Atlanta");      //Essentially we must create an object in order to retrieve the information. 
    views.put("Italy", "Milan");     //What
    ever is in these reference <String> these indexes have a variable in them, that is  
    views.put("UK", "Manchester");
    views.put("Japan", "Tokyo");
    
    for(Entry<String, String> country:views.entrySet()) {
    System.out.println(country.getKey()+ ""+country.getValue());
    }
    
	}

}
