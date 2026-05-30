package demoArray;

public class TwoDArrayDemo {
	
	public static void main(String[] args) {
	
//	int [][] arr = new int[2][3]; // 2 rows and 3 columns, we can declare like this later we can assign values to it. here we have 2 arrays of 3 elements each, so total 6 elements in 2D array
	
	//another way to declare and initialize 2D array
	int [][] arr = {
			{1,2,3},
			{4,5,6}
	};
	
	// to print 2D array we need to use nested loops
	for(int i=0; i<arr.length; i++) { // outer loop for rows, arr.length gives the number of rows, arr.length takes dynamically the number of rows in the array, so if we change the number of rows it will automatically adjust
		for(int j=0; j<arr[i].length; j++) { // inner loop for columns, arr[i].length gives the number of columns in that row
			System.out.print(arr[i][j] + " "); // print the element at row i and column j
		}
		System.out.println(); // print a new line after each row
	
	
		}
	}

}
