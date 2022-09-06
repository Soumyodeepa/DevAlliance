package devLabsAlliance;

public class PrintSumofNatNum {

	public PrintSumofNatNum() {
		// 7. Write a program to print the sum of the first 20 natural numbers. 
	}

	public static void main(String[] args) {
int i, sum = 0, num = 20;
for( i=1; i<=num; i++) {
sum = sum+i;	
}
System.out.println("Sum of 1st 20 natural numbers is: "+sum);
	}

}
