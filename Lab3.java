package labExercises;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first integer number - ");
		int x = s.nextInt();
		System.out.println("Enter the second integer number - ");
		int y = s.nextInt();
		double quotient = x / y;
		double remainder = x % y;
		System.out.println("Remainder is - " + remainder);

		System.out.println("Quotient is - " + quotient);

	}

	public Lab3() {
	}

}
