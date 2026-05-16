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
		
//		String fruits[] = {"Apple", "Mango", "Banana"};
//		
//		for(String f : fruits) {
//			System.out.println("fruit : " + f);
//		}
		
		//-----------------------------------------------------------
		// write empty for loop & see the infinite loop
		
//		for(;;) {
//			System.out.println("for loop testing");
//		}
		
		//-----------------------------------------------------------
		// WAP to print multiple variables together using for loop
		
//		for(int i=0, j = 10; i<10; i++) {
//			System.out.println("value of i: "+ i + " value of j: "+ j); // only i values increments, j remains constant in this scenario
//		}
		//------------------------------------------------------------
		for(int i = 0, j=0; i<=10; i++, j+=2) {
			System.out.println("value of i: "+ i + " value of j: "+ j); //loop will run until condition satisfies
		}
		
	}

}
