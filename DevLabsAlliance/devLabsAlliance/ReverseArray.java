package devLabsAlliance;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {

		// Get Array Size
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int arraySize = sc.nextInt();

		int[] intArray = new int[arraySize];// Declare Array

		// Loop until arraySize
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Enter element " + (i + 1) + ":");
			// Get Each element and store in array
			intArray[i] = sc.nextInt();
		}
		System.out.println("\nElements in array are: " + Arrays.toString(intArray));

		int size = intArray.length;

		for (int i = 0; i < size / 2; i++) {
			//
			// System.out.println("\n\ttemp=intArray[" + i + "]=" + intArray[i]);
			int temp = intArray[i];

			// System.out.println("\tintArray[" + i + "]=intArray[" + size + "-" + i +
			// "-1]=" + intArray[size - i - 1]);
			intArray[i] = intArray[size - i - 1];

			// System.out.println("intArray[" + size + " - " + i + " - 1]=temp=" + temp);
			intArray[size - i - 1] = temp;

			// System.out.println("\tElements in array are: " + Arrays.toString(intArray) +
			// "\n");
		}
		System.out.println("Elements in array after reverse are: " + Arrays.toString(intArray));

	}
}