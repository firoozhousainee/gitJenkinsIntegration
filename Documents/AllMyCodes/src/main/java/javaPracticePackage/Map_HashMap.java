package javaPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Map_HashMap {

	public static void main(String[] args) {

		// "hacker"

		/*
		 * a 1 c 1 e 1 h 1 k 1 r 1 ha 5 ck 5 er 5 sa 5 hac 15
		 */
		String subject = "samim";
		Map<String, Integer> data = new Hashtable<String, Integer>();
		data.put("z", 2);
		data.put("b", 1);
		data.put("hac", 15);
		data.put("sa", 5);
		data.put("er", 5);
		data.put("ck", 5);
		data.put("ha", 5);
		data.put("r", 1);
		data.put("k", 1);
		data.put("mir", 23);
		data.put("e", 1);
		data.put("m", 2);
		data.put("a", 1);
		data.put("hou", 10);
		data.put("in", 8);
		data.put("dfi", 3);
		data.put("o", 5);

		calc(data, subject);

	}

	public static int calc(Map<String, Integer> data, String subject) {
		Map<Integer, List<String>> finalData = new TreeMap<Integer, List<String>>();
		Set<Integer> values = new HashSet<Integer>(data.values()); // the numbers
		List<String> keys = new ArrayList<String>(data.keySet()); // the alphabets

		for (Integer key : values) {
			finalData.put(key, new ArrayList<String>());
			for (int i = 0; i < keys.size(); i++) {
				if (data.get(keys.get(i)) == key) {
					finalData.get(key).add(keys.get(i));
				}
			}
		}
		System.out.println(finalData);

		ArrayList<Integer> tempKeys = new ArrayList<Integer>(values);
		Collections.sort(tempKeys, Collections.reverseOrder());

		System.out.println(tempKeys);
		System.out.println(tempKeys);
		int sum = 0;
		for (Integer theKey : tempKeys) { // 15,2,1

			for (int i = 0; i < subject.length(); i++) {

				for (String seq : finalData.get(theKey)) {
					if (subject.contains(seq)) {
						sum += theKey;

						subject = subject.replaceFirst(seq, "0");

						System.out.print("Key:" + seq + " " + theKey + "\t\t");
						System.out.println(": " + subject);
					}
				}
			}
		}

		System.out.println("Sum: " + sum);
		return sum;
	}

	/*
	 * public static boolean pal(String e) { for (int i = e.length() - 1, j = 0; i
	 * >= 0; i--, j++) { if (e.charAt(i) == e.charAt(j)) { } else {
	 * System.out.println("not palindron"); return false; } } return true; }
	 * 
	 * public static boolean palIgnoreCase(String e) { for (int i = e.length() - 1,
	 * j = 0; i >= 0; i--, j++) { if (e.toLowerCase().charAt(i) ==
	 * e.toLowerCase().charAt(j)) { } else { System.out.println("not palindron");
	 * return false; } } return true; }
	 */
}
