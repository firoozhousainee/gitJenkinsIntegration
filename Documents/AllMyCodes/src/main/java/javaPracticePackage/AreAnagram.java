package javaPracticePackage;

import java.util.Arrays;

public class AreAnagram {

	public static void main(String[] args) {
		String word1 = "test";
		String word2 = "test";
		char[] w1 = word1.toCharArray();
		char[] w2 = word1.toCharArray();
		
		
		System.out.println(areAnagram(w1, w2));
		

	}

	static boolean areAnagram(char[] str1, char[] str2) {
		// Get lenghts of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;
	}
}
