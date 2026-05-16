package loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// WAP to print battery percent using while loop
		
		int phoneBattery = 0;
		
		while(phoneBattery<100) {
			
			phoneBattery += 5; // increment to 5 percent
			
			if(phoneBattery == 80) // i want to stop charging when it reach 80
				break; // stops execution
			
			if (phoneBattery == 5)				
				continue; // skips that iteration
				
			
			System.out.println("Battery percent: " + phoneBattery);
		}
		
		System.out.println("Battery level outside the loop" + phoneBattery);
		

	}

}
