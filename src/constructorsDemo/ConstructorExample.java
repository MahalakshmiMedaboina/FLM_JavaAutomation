package constructorsDemo;

class Mobile {
	String brand;
	int price;
	
	Mobile(){
		System.out.println("This is a default constructor"); // this will be printed when we create an object of the class without passing any arguments, it will initialize the instance variables with default values (null for String and 0 for int)
		brand = "Unknown"; // we can also initialize the instance variables in the constructor, here we are initializing the brand with "Unknown" and price with 0
		price = 0;
	}
	
	Mobile(String a, int b) { // this is a parameterized constructor, it has parameters to initialize the object of the class, it is called when we create an object of the class and pass arguments to it
		System.out.println("This is a Parameterized constructor");
		brand = a; // this keyword is used to refer to the current object of the class, it is used to differentiate between the instance variable and the local variable, here we are assigning the value of the parameter brand to the instance variable brand
		price = b; 
	}
	
	void displayDetails() { // this is a method to display the values of the instance variables
		System.out.println("Brand: " + brand + " price "+ price); // print the value of brand 
	}
}

public class ConstructorExample {

	
	public static void main(String[] args) {
		Mobile M1 = new Mobile(); // creating an object of the class, this will call the constructor 
		M1.displayDetails(); // calling the method to display the details of the object, this will print the default values of the instance variables
		
		Mobile M2 = new Mobile("Apple", 1000); // this will call the parameterized constructor and initialize the instance variables with the values passed as arguments.
		M2.displayDetails(); // calling the method to display the details of the object, this will print the values of the instance variables that we passed while creating the object
		
	}
}
