package conditionalStatements;

public class BloodDonationEligibility {

	public static void main(String[] args) {
		// WAP to check if a person is eligible to donate blood based on their age and weight. A person is eligible to donate blood if they are at least 18 years old and weigh at least 50 kg.
		// nested if statement: it is an if statement that is inside another if statement, it is used to check multiple conditions in a hierarchical manner
		
		int age = 25; // variable to store the age of the person
		double weight = 70.5; // variable to store the weight of the person
		
		if(age >= 18) {
			if(weight >= 50) {
				System.out.println("You are eligible to donate blood."); // block of code to execute if both conditions are true
			} else {
				System.out.println("You are not eligible to donate blood due to insufficient weight."); // block of code to execute if the weight condition is false
			}
			
		}else {
			System.out.println("You are not eligible to donate blood due to age."); // block of code to execute if the age condition is false
		}

	}

}
