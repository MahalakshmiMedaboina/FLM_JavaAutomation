package oop_Polymorphism;

//WAP to for method overloading

// method overloading means same method name but diff parameters & datatypes

public class MethodOverloadingSum {
	
	void sum(int a, int b) {
		System.out.println("sum of two type int nums:"+ (a+b));
		}
	
	void sum(int a, int b, int c) {
		System.out.println("sum of three type int nums:"+ (a+b+c));
		}
	void sum(double a, double b) {
		System.out.println("sum of two type double nums:"+ (a+b));
		}

	public static void main(String[] args) {
		
		
		MethodOverloadingSum add = new MethodOverloadingSum();
		add.sum(2, 3);
		add.sum(1, 2, 3);
		add.sum(21.2, 23.2); 
		
		// if we give one value int & another double, what it will do?
		
		add.sum(21, 23.2);
		

	}

}
