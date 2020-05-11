package javaPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysConcept_Sorting_Reversing {

	public static void main(String[] args) {
		String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars.length);
		
		cars[0] = "Opel"; // replaces element 0 index
		System.out.println(cars[0]);
		
		Arrays.sort(cars); // sort() method from Arrays class
		Collections.reverseOrder();
		System.out.println("Is this reversed? " + cars.toString());
		
		int[] num = {99, 30,21,35,40};
		Arrays.sort(num); // sorting the array chronologically 
		System.out.println(Arrays.toString(num));
		//Arrays.sort(num, Collections.reverseOrder());
		
		String str = "let me reverse for you"; // reversing a String
		String reverse = "";
		for(int i = str.length()-1; i>1; i--) {
			reverse = reverse+str.charAt(i);
			System.out.println(reverse);
		}
		
		String k = "Let me reverse for you";
		StringBuffer bf = new StringBuffer(k);
		System.out.println(bf.reverse());
		
		int[] allNum = {2,3,6,7,1,77,98}; // finding the max and min
		int smallest = allNum[0];
		int largest = allNum[0];
		for(int i = 0; i<allNum.length; i++) {
			if(allNum[i]>largest) {
				largest = allNum[i];
			} else if(allNum[i]<smallest) {
				smallest = allNum[i];
				System.out.println(Arrays.toString(allNum));
				System.out.println(smallest);
				System.out.println(largest);
				
			}
			
		}
//		for(int i =0; i <cars.length; i++) {
//			System.out.println(cars[i]); // printing array elements 	
//		
//		}
//		
				
		}int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

      


}

