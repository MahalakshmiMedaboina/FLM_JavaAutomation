package loops;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// WAP to print battery percent using do-while loop
		
		int phoneBattery = 40;
		
		do {
			
			phoneBattery += 5;
			
			if (phoneBattery == 80)
				continue;
			if(phoneBattery == 90)
				break;
			
			System.out.println("Current Battery percent: "+ phoneBattery);
		}while(phoneBattery <= 100);
		
		System.out.println("Battery level out of while loop:"+ phoneBattery);

	}

}
