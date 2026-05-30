package final_keyword;


class A{
	final void display() {
		System.out.println("This is a final method in class A");
	}
}

class B extends A{
	// Attempting to override the final method will cause a compile-time error 
	
//		@Override
//		void display() {
//			System.out.println("Trying to override the final method in class B");
//		}
	
	}

public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
