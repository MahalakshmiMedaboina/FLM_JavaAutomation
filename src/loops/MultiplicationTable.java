package loops;

public class MultiplicationTable {

	public static void main(String[] args) {
		// WAP to print 5 tables using nested for loop
		
		System.out.println("----Tables (1 to 5)----");
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("Table of "+ i);
			
			for(int j=1; j <=10; j++) {
				System.out.println((i*j) + " ");
			}
		}

	}

}
