package demoArray;

public class ArrayDemo {

	public static void main(String[] args) {
		// WAP for integer array & string array
		
		int[] grades = new int[3];
		
		grades[0] = 11;
		grades[1] = 21;
		grades[2] = 31;
		
		System.out.println("------------------- EX- 1(a)Int array ----------------------------");
		
		System.out.println("Value of index 0 is: " + grades[0]);
		System.out.println("Value of index 1 is: " + grades[1]);
		System.out.println("Value of index 2 is: " + grades[2]);
		
		System.out.println("-----------------EX- 2(a)String array ---------------------------");
		String[] color = new String[3];
		
		color[0] = "Red";
		color[1] = "Blue";
		color[2] = "Green";
		
		System.out.println("Value of index 0 is: " + color[0]);
		System.out.println("Value of index 1 is: " + color[1]);
		System.out.println("Value of index 2 is: " + color[2]);

		//assigning values to index for few numbers is fine. but if we have 100 ? in the above example only index changed, so here we can use loops
		System.out.println("------------------- EX- 1(b)Int array ----------------------------");
		
		//same ex - 1(a) will write using loop
//		for(int i=0; i<3; i++) {
//			System.out.println("Value of index "+i+" is: " + grades[i]);
//		}
		
		//-------------------------------------------------------------------------------------
//		suppose idk for how many times i need to run the array, then we can use array.length, it will allocate dynamically
		System.out.println("------------------- EX- 1(b)Int array using length in conditional ----------------------------");
		
//		for(int i=0; i<grades.length; i++) {
//			System.out.println("Value of index "+i+" is: " + grades[i]);
//		}
		
		//-----------------------------------------------------------------------------------
		// will write same example using enhanced for loop
		System.out.println("------------------- EX- 1(b)Int array using enhanced for loop----------------------------");
		for(int temp: grades) {
			System.out.println("Value of index is: " + temp); // in 1st iteration it will take value & keep it in temp, 2nd iteration it overrides the 1st value, same way for all
						// so whatever variable we take ex: temp, that holds the value of that particular iteration.
			}
		
		//----------------------------------------------------------------------------------
		// write 
		System.out.println("------------------- EX- 2(b)String array using enhanced for loop----------------------------");
		
		for(String rangu : color) {
			System.out.println("Value it is holding: " + rangu); //the no.of times loop will run for the no.of elements it contains
		}
		 
//		----------------------------------------------------------------------------------
		// write some basic math operation 
		
		int a = 2;
		int b = 23;
		
		a += 3;
		a %= 2;
		b -= 3;
		b /= 3;
//		System.out.println("a current value "+a);
//		System.out.println("b current value "+b);
		
		//----------------------------------------------------------------------------------
		// Assignment: declare array with size 20, and assign values at each index, print it using for loop
		
		int[] arr = new int[20];
		
		arr[0] = 23;
		arr[1] = 32;
		arr[2] = 34;
		arr[3] = 323;
		arr[4] = 231;
		arr[5] = 2345;
		arr[6] = 12;
		arr[7] = 11;
		arr[8] = 234;
		arr[9] = 890;
		arr[10] = 895;
		arr[11] = 32;
		arr[12] = 34;
		arr[13] = 323;
		arr[14] = 231;
		arr[15] = 2345;
		arr[16] = 12;
		arr[17] = 11;
		arr[18] = 234;
		arr[19] = 890;
		
		System.out.println("------------------- for loop----------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println("array value num is holding now at index "+ i + " is:"+  arr[i]);
		}
		
		System.out.println("------------------- enhance for loop----------------------------");
		for(int num : arr) {
			System.out.println("array value num is holding now : "+ num);
		}
		
	}

}
