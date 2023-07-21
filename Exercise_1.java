import java.util.Scanner;

public class Exercise_1 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Tell the user to enter a 5-digit positive integer
		System.out.print("Enter a 5-digit positive integer: ");
		
		int number = scnr.nextInt();
		
		// Compute each individual digit
		int digit1 = number % 10;
		number /= 10;
		
		int digit2 = number % 10;
		number /= 10;
		
		int digit3 = number % 10;
		number /= 10;
		
		int digit4 = number % 10;
		number /= 10;
		
		int digit5 = number % 10;
		number /= 10;
		
		// Calculate and display the sum of the digits
        int sum = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println("The sum of the digits is " + digit5 + " + " + digit4 + " + " + digit3 + " + " + digit2 + " + " + digit1 + " = " + sum);
	
	}
}