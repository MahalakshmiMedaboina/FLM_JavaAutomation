package oop_Encapsulation;

// WAP (Write A Program) if temp is between 15 to 30, then assign it to temperature else ignore it.
// This demonstrates the concept of Encapsulation - hiding internal data and providing controlled access

// Define a thermostat class that demonstrates encapsulation principles
class thermostat{

	// Private variable: cannot be accessed directly from outside the class
	// This hides the internal temperature value and forces external code to use methods to access it
	private double temperature;

	// Setter method: allows controlled assignment of temperature value
	// We need this method to validate input before storing it (only accepts values between 15-30)
	// Without this method, we couldn't ensure data integrity
	public void setTemperature(double newTemp) { 
		// Check if the new temperature is within the valid range (15 to 30 degrees)
		// This validation ensures only valid temperatures are stored in the temperature variable
		if(newTemp >= 15.00 && newTemp <= 30) {
			// If valid, assign the new temperature to the instance variable using 'this' keyword
			// 'this.temperature' refers to the class variable, distinguishing it from the parameter 'newTemp'
			this.temperature = newTemp;
			
			// Inform the user that the temperature was successfully set
			System.out.println("Temp set to:"+ newTemp);
		}else {
			// If temperature is out of range, reject it and show an error message
			// The old temperature value remains unchanged, protecting data integrity
			System.out.println("Error: Temp is out of range:");
		}
	}
	
	// Getter method: allows external code to read the temperature value
	// We need this method because temperature is private and cannot be accessed directly
	// This method provides controlled read-only access to the private variable
	public double getTemperature() {  
		// Return the current temperature value stored in the private variable
		// This allows other classes to view the temperature without modifying it
		return temperature;
	}

}

// Main class to test the thermostat encapsulation
public class EncapsulationTest {

	// Main method - entry point of the program
	public static void main(String[] args) {
		// Create an instance (object) of the thermostat class called 'myRoom'
		// This object will manage the temperature for a room using encapsulation
		thermostat myRoom = new thermostat();
		
		// Set the temperature to 22.5 degrees (valid value within 15-30 range)
		// This calls the setter method which validates the input before storing it
		myRoom.setTemperature(22.5);
		
		// Read and display the current temperature using the getter method
		// This demonstrates that the valid temperature was successfully stored
		System.out.println("current reading:" + myRoom.getTemperature());
		
		// Attempt to set the temperature to 40 degrees (invalid - outside the 15-30 range)
		// The setter will reject this value and keep the previous valid temperature
		myRoom.setTemperature(40);
		
		// Read and display the temperature again
		// This shows that the temperature remained at 22.5 because the invalid input was rejected
		// This demonstrates how encapsulation with validation protects data integrity
		System.out.println("current reading after invalid input:" + myRoom.getTemperature());
		
		

	}

}
