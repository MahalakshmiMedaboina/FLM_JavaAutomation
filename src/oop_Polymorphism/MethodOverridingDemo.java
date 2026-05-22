package oop_Polymorphism;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
	
	void legs() {
		System.out.println("Animal has 4 legs");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	@Override
	void legs() {
		System.out.println("Dog has 4 legs");
	}
	
	void breed() {
		System.out.println("Dog breed is Labrador");
	}
}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.makeSound(); // This will call the overridden method in Dog class
		myDog.legs(); // This will call the overridden method in Dog class
		myDog.breed(); // This will call the method in Dog class
		
	}

}
