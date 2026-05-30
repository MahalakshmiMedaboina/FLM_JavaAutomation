package final_keyword;

public class FinalVarDemo {

	public static void main(String[] args) {
		
		final int a = 10; // Final variable, must be initialized at the time of declaration
		
//		int a = 20; // This will cause a compile-time error because 'a' is already declared as final, we cannot overwrite it
		
		System.out.println("Value of a: " + a);
		
		// Final variables cannot be reassigned

	}

}
