package devLabsAlliance;

import java.util.Scanner;

public class FactorialWithWhileLoop {

	public FactorialWithWhileLoop() {
	}

	public static void main(String[] args) {
/* Assignment 1
 * 1. Write a program to calculate the factorial of a number using a while loop.
The factorial of a positive number n is given by:
factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n 
 */
		int a = 1;
		int fact = 1;
		//FactorialWithWhileLoop factorial = new FactorialWithWhileLoop();
		System.out.println("Enter a number to find the factorial");
Scanner sc=new Scanner(System.in);
int b = sc.nextInt();

System.out.println("User Input is:"+b);
		while(a<=b) {
			fact=fact*a;
			a++;
			}
		System.out.println("Factorial of "+b+"is:"+fact);
		}

	

	
	}


