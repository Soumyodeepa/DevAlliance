package labExercises;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer length of the rectangle - ");
		int l = s.nextInt();
		System.out.println("Enter the integer breadth of the rectabgle - ");
		int b = s.nextInt();
		int area = l * b;
		int perimeter = (l + b) * 2;

		System.out.println("Area of the triangle is " + area);
		System.out.println("Perimeter of the rectangle is " + perimeter);
	}

	public Lab1() {

	}
}
