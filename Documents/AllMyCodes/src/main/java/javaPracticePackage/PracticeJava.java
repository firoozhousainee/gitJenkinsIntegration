package javaPracticePackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PracticeJava {

	public static void main(String[] args) {
		
		// finding the max number
		// finding max number in an array 
		// reverse string 
		// reverse integer
		// remove junk/special chars in a String
		// swap two integers
		// swap two Strings
		// Find duplicate elements in an array 
		// Remove duplicate elements in an array 
		// work on math class 
		// summing array elements 
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(15);
		num.add(25);
		num.add(30);
		num.iterator();
		ListIterator iterator = num.listIterator();
		
		while(iterator.hasNext()) {
			
		System.out.println("lets see what it does for us: " + iterator.next());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}
		
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	    

}
