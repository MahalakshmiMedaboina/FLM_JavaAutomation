package oop_Inheritance;

class Phone{
	void start() {
		System.out.println("Phone is starting");
	}
}

class Smartphone extends Phone{
	@Override
	void start() {
		System.out.println("Smartphone is starting with Android");
	}
	
	void callParentStart() {
		super.start(); // Calling the start method of the parent class (Phone)
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone();
		
		System.out.println("---Calling child class method---");
		myPhone.start(); // This will call the overridden method in Smartphone class
		
		System.out.println("---Calling parent class method---");
		myPhone.callParentStart(); // This will call the method in Smartphone class

	}

}
