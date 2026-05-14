package conditionalStatements;

public class EligibleToVote {

	public static void main(String[] args) {
		// if else statement: it is a control flow statement that allows us to execute a block of code based on a condition, it is used to make decisions in our program
		int age = 18; // variable to store the age of the person
		
		if (age >= 18) { // condition to check if the person is eligible to vote
			System.out.println("You are eligible to vote."); // block of code to execute if the condition is true
		} else {
			System.out.println("You are not eligible to vote."); // block of code to execute if the condition is false
		}
	}

}
