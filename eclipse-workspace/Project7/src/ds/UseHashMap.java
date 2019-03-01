package ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseHashMap {

	public static void main(String[] args) {
       Map<String, String> map = new HashMap<String,String>();//  create an object to find the string. 
	   map.put("USA", "New York");// USA is the key and NY is the value. 
	   map.put("UK", "London");
	   map.put("Bangladesh","Dhaka");
	   map.put("Canada", "Montreal");
	   
	   for(Entry<String, String> country:map.entrySet()) {
	   System.out.println(country.getKey()+ "" +country.getValue());	
	
	
	   }
	
	
	
	
	}

}
