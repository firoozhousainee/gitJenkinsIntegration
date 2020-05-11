package javaPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConept {

	public static void main(String[] args) {
		ArrayList<String> vehicles = new ArrayList<String>();
		vehicles.add("Volvo");
		vehicles.add("BMW");
		vehicles.add("Ford");
		vehicles.add("Mazda");
		vehicles.add("Chevi");
		vehicles.remove(3);
		vehicles.add("Replacedcar");
		System.out.println(vehicles); // printing all the elements
		
		String v = vehicles.get(2); // .get() accessing elements
		System.out.println(v);
		// change an item using .set()
		vehicles.set(4, "Toyota");
		System.out.println(vehicles.get(4));
		System.out.println("Size is: " + vehicles);
		Collections.sort(vehicles); // sort the arraylist
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(15);
		num.add(98);
		num.add(3);
		num.add(12);
		num.add(13);
		num.add(13);
		Collections.sort(num);
		System.out.println("Is num sorted? " + num);
//		for (String i : vehicles) {
//		      System.out.println("For each loop printing .." + i);
//		
//		// vehicles.clear(); // clears elements in the arraylist
////		System.out.println(vehicles);
//
//	}
		
		// object array 
		ArrayList harchi = new ArrayList(); 
		harchi.add("word");
		harchi.add(25);
		harchi.add('l');
		harchi.add(25.63);
		
		for(Object obj: harchi){
			System.out.println(":: " + harchi.size());
			System.out.println(obj);
		}
			

}
}
