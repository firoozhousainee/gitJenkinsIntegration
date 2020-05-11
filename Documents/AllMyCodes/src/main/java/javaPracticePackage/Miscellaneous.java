package javaPracticePackage;


public class Miscellaneous {
	static int b = 4;
	static int a = b;
	
	
	

	public static void main(String[] args) {
//		// instance of Integer type 
//        Test <Integer> iObj = new Test<Integer>(15); 
//        System.out.println(iObj.getObject()); 
//   
//        // instance of String type 
//        Test <String> sObj = 
//                          new Test<String>("GeeksForGeeks"); 
//        System.out.println(sObj.getObject()); 
        firooz:
        	for(int i  = 1; i<=10; i++) {
        		System.out.println(i);
        		Samim:
        			for(int j = 11; j<=20; j++) {
        				System.out.println(j); 
        				if(j == 12) {
        					break firooz;
        				}
        				
        			}
        	}
        

	}
	

}
