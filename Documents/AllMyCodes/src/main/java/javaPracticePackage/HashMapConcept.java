package javaPracticePackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapConcept {
	public static void main(String[]args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
		
	    HashMap<Integer, String> lock = new HashMap<Integer, String>();
	    lock.put(001, "Smith Lock");
	    lock.put(002, "Ding");
	    lock.put(003, "Khing");
	    lock.put(004, "King");
	    lock.put(005, "Fing");
	    lock.put(00,"New Lock");
	    
	    System.out.println(lock);
	    System.out.println();
	    
	    System.out.println(lock.get(004));
	    System.out.println(lock.get(00));
	    
	    
		
		
		
		
	}

}
