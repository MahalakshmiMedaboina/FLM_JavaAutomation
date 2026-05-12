package demoArray;

public class IntArrayDemo {

	public static void main(String[] args) {
		// use array when we want to store multiple values of same datatype in a single variable, it is a collection of similar data types
		
		// WAP to declare int array and store the values
		
		int[] portnums = new int[5]; // declaration and initialization of array
		
		portnums[0] = 10; // storing values in array using index
		portnums[1] = 20;
		portnums[2] = 30;
		portnums[3] = 40;
		portnums[4] = 50;
		
		System.out.println("Port numbers:"+ portnums[0]); // accessing array elements using index
		

	}

}
