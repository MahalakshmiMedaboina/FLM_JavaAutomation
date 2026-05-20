package oop_Polymorphism;

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
		// WAP to for method overloading
		
		MethodOverloadingSum add = new MethodOverloadingSum();
		add.sum(2, 3);
		add.sum(1, 2, 3);
		add.sum(21.2, 23.2);
		
		

	}

}
