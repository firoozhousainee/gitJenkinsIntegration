package javaPracticePackage;

public class abc {
	
	public static void main(String[]args) {
		
		for(int count = 0; count<=10; count+=2) {
			System.out.println(count);
			
		}
		//String[] st = {"Define","Determine","Delete","All"};
		String p = "Define";
		String[] charST = p.split("");
		
		for(Object obj: charST) {
			if(obj.equals("e"))
			System.out.println("O");
		}
		
		String a = "final";
		// split the string to characters array
		String [] temp = a.split("");
		
		// loop through each element of the array characters
		for(String e: temp) {
			if(e.equals("a") ) {  // look for 'a' element
				System.out.print("o"); // when i find it, i will replace it with 'o'
			}
			System.out.print(e);}}
		 int cigars; 
		 boolean isWeekend;
		public boolean cigarParty(int cigars, boolean isWeekend) {
			return cigars >= 40 && (cigars <= 60 || isWeekend);

			}
	}
		
