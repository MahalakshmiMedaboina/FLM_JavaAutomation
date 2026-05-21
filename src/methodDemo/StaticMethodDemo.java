package methodDemo;

public class StaticMethodDemo {
	
	public static int CalculateSquare(int n) {
		return n* n;
	}

	public static void main(String[] args) {
		
		int square = CalculateSquare(4); // assign method to the variable. 
		System.out.println("Square of a num"+ square); 
	}

}
