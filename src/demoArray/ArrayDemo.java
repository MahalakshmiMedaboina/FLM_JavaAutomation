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
		

		
	}

}
