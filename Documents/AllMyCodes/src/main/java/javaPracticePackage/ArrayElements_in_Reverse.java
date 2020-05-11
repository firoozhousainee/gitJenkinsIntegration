package javaPracticePackage;

public class ArrayElements_in_Reverse {
	
	// printing array elements in reverse order
	public static void main(String[] args) {
		int[] d = { 1, 2, 3, 4, 5 };

		for (int j = 0; j < 4; j++) {

			int x = d[0];
			for (int i = 0; i < d.length - 1; i++) {

				d[i] = d[i + 1];
			}
			d[d.length - 1] = x;
		}

		for (int i : d) {
			System.out.println(i);
		}
	}
}
