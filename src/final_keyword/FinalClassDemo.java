package final_keyword;
// we can declare a class as final, which means that the class cannot be subclassed. This is useful when you want to prevent inheritance and ensure that the class's behavior remains unchanged.

// we can declare final class, methods, and variables. A final class cannot be extended, a final method cannot be overridden, and a final variable cannot be reassigned after it has been initialized.
final class FinalClassDemo {
		String name = "Final Class A";
		{
		System.out.println(name);
		}
}

//class B extends A{
//	// Attempting to extend the final class will cause a compile-time error 
//}



