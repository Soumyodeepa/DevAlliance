package devLabsAlliance;

public class Fibonacci10Print {

	public Fibonacci10Print() {
//2. Write a program to print fibonacci series (10 values). 
		}

	public static void main(String[] args) {
		int range = 10;
		int firstNumber = 0;
		int secondNumber = 1;
		int sumOfTwo;
		for (int i = 0; i < range; i++) {
			System.out.println(firstNumber);
			
			sumOfTwo = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumOfTwo;
	}

	}
}

