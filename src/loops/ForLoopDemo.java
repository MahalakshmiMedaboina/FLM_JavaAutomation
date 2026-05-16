package loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		// print numbers from 1 to 5
		
//		for(int i=1; i<=5; i++) {
//			System.out.println("value of i is: "+i);
//		}
		//------------------------------------------------------------
		//print 5 to 1 using for loop
//		for(int i=5; i>=1; i--) {
//			System.out.println("value of i is: "+i);
//		}
		//------------------------------------------------------------
		
		// WAP to print even nums from 10 to 1
		
//		for(int i = 10; i>= 1; i-=2) {
//			System.out.println(i);
//		}
		
		//------------------------------------------------------------
		// WAP to print even nums from 1 to 10
		
//		for(int i = 1; i<= 10; i++) {
//			System.out.println(i);
//		}
		
		//-----------------------------------------------------------
		//WAP to print array string elements using enhanced for loop
		
		String fruits[] = {"Apple", "Mango", "Banana"};
		
		for(String f : fruits) {
			System.out.println("fruit : " + f);
		}
		
		
	}

}
