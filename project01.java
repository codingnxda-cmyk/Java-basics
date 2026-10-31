package Week1;

import java.util.Scanner;

public class project01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Cinema!");
		
		final float TICKET_PRICE = 12.00f;
		
		System.out.println("Name: ");
		String name = input.nextLine();
		
		System.out.println("Age: ");
		int age = input.nextInt();
		
		boolean youngerThan13 = age < 13;
		
		
		if (youngerThan13) {
			System.out.printf("£%.2f", TICKET_PRICE / 2);
			System.out.println("\nChild discount: " + youngerThan13);

		} else {
			System.out.printf("£%.2f" , TICKET_PRICE);
			System.out.println("\nChild discount: " + youngerThan13);
		}
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		input.close();
	}

}
