package javaPracticePackage;

public class Dropping_Chars {

	public static void main(String[] args) {

		// Printing 2 less of first letters 
		String s = "Janan";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length() - i; j++) {
				System.out.print(s.toUpperCase().charAt(j));
				
			}
			System.out.println();
		}
	}

}
