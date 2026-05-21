package oop_abstraction;

abstract class Vehicle { //abstract class
	
	abstract void startEngine(); // abstract method, no imple is defined now
	
	static void industryInfo() { //static method
		System.out.println("Industry: Transport level");
	}
	
	void fuelStatus(String model, int level) { // user defined method
		System.out.println("Model:" + model + "Fuel status:" + level);
	}
}
	
	class car extends Vehicle{ // to use abstract method we need to create seperate class then extend it, and use the abstract method
		
		void startEngine() {
			System.out.println("Car: Start the car using a push button");
		}
	}
	
	 class MethodComparision { // main class
		
		public static void main(String[] args) {
			
			Vehicle.industryInfo(); //static method we called without creating obj
			
			car myCar = new car();
			
			myCar.fuelStatus("Tata Harrier", 70);
			
			myCar.startEngine();
					
			
	}
	
	
}
