package loops;

public class MultiplicationTable {

	public static void main(String[] args) {
		// WAP to print 1 to 10 tables using nested for loop
		
//		System.out.println("----Tables (1 to 5)----");
//		
//		for(int i=1; i<= 5; i++) {
//			
//			System.out.println("Table of "+ i);
//			
//			for(int j=1; j <=10; j++) {
//				System.out.println((i*j) + " ");
//			}
//		}
		
		//----------------------------------------------------
		// WAP to print 11 to 15 tables using nested for loop
		
		System.out.println("----Tables (11 to 15)----");
		for(int i = 11; i<=15; i++) {
			
			System.out.println("Table of "+ i); 
			
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x "+ j + " = " + (i*j));
			}
			
		}
		
	}

}
