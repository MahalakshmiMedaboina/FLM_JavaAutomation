package methodDemo;

public class ClassRoomAssit {
	// Will write User defined methods: methods written by user 	
	// there are predefined methods aswell - already logic is written we just need to call the method to use it.
	
	// Type 1: Basic method - no return type, no parameters
	
	public void DisplayName() {
		System.out.println("BAsic method");
	}
	
	// Type 2: Parameterized method - no return type, only parameters
	
	public void StudentDetails(String name, int rollno) {
		
		System.out.println("name: "+ name + " rollno:" + rollno);
	}
	
	// Type 3: with return type, parameterized
	
	public double CalculateMarks(int obtainedMarks, int totalMarks) {
		double percentage = ((double)obtainedMarks/totalMarks)*100; //here we concatenated to double, but in params it is int
		return percentage;
	} 
	
	public static void main(String[] args) { // starting point, 
		// to access methods we need to create obj
		
		ClassRoomAssit asst = new ClassRoomAssit();
		
		asst.DisplayName(); 				// we are printing it
		asst.StudentDetails("Maha", 36);	// we are printing it
		
		double percent=	asst.CalculateMarks(100, 200);		// no print, then how? so it is recommanded to store it in var with the same return type 
		// now print it
		System.out.println("percentage: "+ percent);
		
		
		

	}

}
