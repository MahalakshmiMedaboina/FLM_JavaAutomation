
public class StudentRecord {
	
	String name; // instance variable, it is a variable that is declared inside the class but outside the method, it is also called as non static variable
	int rollno;
	
	void display() { // instance method, it is a method that is declared inside the class but outside the main method, it can access the instance variables and it can be called using object reference
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollno);
	}
}

class Main {
	

	public static void main(String[] args) {
		// class: a blueprint for creating objects, it is a user defined data type that contains variables and methods
		// object: an instance of a class that has state and behavior, it is created using the new keyword and it can access the instance variables and methods of the class
		
		//lets create 5 student records using class and object
		StudentRecord s1 = new StudentRecord(); // creating an object of Student class
		s1.name = "John"; // accessing instance variable using object reference
		s1.rollno = 101; 
		
		StudentRecord s2 = new StudentRecord();
		s2.name = "Alice";
		s2.rollno = 102;
		
		StudentRecord s3 = new StudentRecord();
		s3.name = "Bob";
		s3.rollno = 103;
		
		StudentRecord s4 = new StudentRecord();
		s4.name = "Charlie";
		s4.rollno = 104;
		
		s1.display(); // calling instance method using object reference
		s2.display();
		s3.display();
		s4.display();
		
		

	}

}
