package javaPracticePackage;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Tests {

	public static void main(String[] args) {
		Object [] object = {1, 3, 4, 5, " Dang", "fang", 'A', 3.44};
		
		Set<String> str = new HashSet<String>();
		Set<Integer> num = new HashSet<Integer>();
		str.add("ABC");
		str.add("EEEEE");
		str.add("FFFFFFFFFF");
		System.out.println(str.size());
		System.out.println(str.toString());
		System.out.println(num);
		System.out.println("Code changeddddd");
		
		for(int j =0; j<object.length; j++) {
			System.out.println(object.toString().length());

        // Get the array 
        int arr[] 
            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
  
        // Get the String representation of array 
        String stringArr = Arrays.toString(arr); 
  
        // print the String representation
        System.out.println("Array: " + stringArr);
        System.out.println("Array: " + stringArr);
        
        // or 
     // Get the array 
        int array[] 
            = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
  
        // Print the array 
        System.out.println("Array: "
                           + Arrays.toString(array)); 
        
        ArrayList<String> st = new ArrayList();
        st.add("Fou");
        st.add("Jou");
                
        for(int i =0; i<st.size();i++) {
        	System.out.println(st.toArray()[i]);
        }

		

	}
	}
}
