package conditionalStatements;

public class ApartmentLift {

	public static void main(String[] args) {
		// WAP, to go to 5th floor, out of 10 floors, using switch statement, if the floor number is 1, 2, 3, 4, 5, print "Going down", if the floor number is 6, 7, 8, 9, 10, print "Going up", if the floor number is not between 1 and 10, print "Invalid floor number"
		
		int floorNumber = 5; // variable to store the floor number
		
		switch(floorNumber) { // switch statement to check the floor number
		case 1:
			System.out.println("floor 1");
			break; // break statement to exit the switch block
		case 2:
			System.out.println("floor 2");
			break;
		case 3:
			System.out.println("floor 3");
			break;
		case 4:
			System.out.println("floor 4");
			break;
		case 5:
			System.out.println("floor 5");
			break;
		case 6:
			System.out.println("floor 6");
			break;
		case 7:
			System.out.println("floor 7");
			break;
		case 8:
			System.out.println("floor 8");
			break;
		case 9:
			System.out.println("floor 9");
			break;
		case 10:
			System.out.println("floor 10");
			break;
		default: // default case to handle invalid floor numbers
			System.out.println("Invalid floor number");
				
		}
	}

}
