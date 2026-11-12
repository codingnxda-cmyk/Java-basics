package week1;

// Class name (Starts with upper case first letter)
// Every line of code that runs in Java must be inside a class.
// The name of the Java file must match the class name

public class Print { 

	// main() it is where the program starts.
	// Any code placed inside the main() method will be executed.
	
	public static void main(String[] args) {
		
		// Printing out words they must be between " "
		System.out.println("Hello World"); // end with ;
		// println() prints Hello World and then moves to a new line	
		
		// Case 1 
		System.out.print("Hello World");
		System.out.print("OOO");  // print() does NOT move to a new line
		System.out.println(); // prints space
		
		// Case 2 Trying out print() then println()
		System.out.print("Hello World");
		System.out.println("James"); 

		// Case 3 println() then print()
		System.out.println("Hello World"); 
		System.out.print("Maria"); 
		System.out.println(); // I need to use println so that a line break can happen so next code won't be printed on same line

		
		// Print numbers
		// We don't use " " for numbers or else it would become a string
		System.out.println(3);
		System.out.println(67.7996);
		
		// Can perform mathematical calculations 
		// Arithmetic operators
		System.out.println(3 + 999);
		System.out.println(8 - 5);
		System.out.println(56 / 8); // returns quotient
		System.out.println(45 % 6); // returns remainder
		System.out.println(3 * 7);



	}  

}
