
public class Student {

	public static void main(String[] args) {
		
		// Datatypes
		
		byte age = 12; // 1 byte
		short year = 2026; // 2 bytes
		int rollno = 2345446; // 4 bytes
		long phone = 9876543210L; // 8 bytes
		float percentage = 89.5f; // 4 bytes
		boolean isPassed = true; // 1 byte
		char grade = 'A'; // 2 bytes
		
		System.out.println("Age: " + age);
		// max value of byte is 127, if we try to assign a value greater than 127, it will give an error
		System.out.println("Max value of byte: " + Byte.MAX_VALUE);
		
		System.out.println("Year: " + year);
		System.out.println("Max value of short: " + Short.MAX_VALUE);
		
		System.out.println("Roll No: " + rollno);
		System.out.println("Max value of int: " + Integer.MAX_VALUE);
		
		System.out.println("Phone: " + phone);
		System.out.println("Max value of long: " + Long.MAX_VALUE);
		
		System.out.println("Percentage: " + percentage);	
		System.out.println("Max value of float: " + Float.MAX_VALUE);
		
		System.out.println("Passed: " + isPassed);
		System.out.println("Max value of boolean: " + Boolean.TRUE);
		
		System.out.println("Grade: " + grade);
		System.out.println("Max value of char: " + Character.MAX_VALUE);
		

	}

}
