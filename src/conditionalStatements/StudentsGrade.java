package conditionalStatements;

public class StudentsGrade {

	public static void main(String[] args) {
		// use if-else if statement to determine the grade of a student based on the marks obtained
		
		int marks = 85; // variable to store the marks obtained by the student
		
		if (marks >= 90) { // condition to check if the marks are greater than or equal to 90
			System.out.println("Grade: A"); // block of code to execute if the condition is true
		} else if (marks >= 80) { // condition to check if the marks are greater than or equal to 80
			System.out.println("Grade: B"); // block of code to execute if the condition is true
		} else if (marks >= 70) { // condition to check if the marks are greater than or equal to 70
			System.out.println("Grade: C"); // block of code to execute if the condition is true
		} else if (marks >= 60) { // condition to check if the marks are greater than or equal to 60
			System.out.println("Grade: D"); // block of code to execute if the condition is true
		} else { // block of code to execute if all the above conditions are false
			System.out.println("Grade: F");
		}

	}

}
