package devLabsAlliance;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCheck {

	public LeapYearCheck() {
	}

	public static boolean checkYear (int year) {
		Year y = Year.of(year);
		return y.isLeap();
		
	}

    public static void main (String[] args) {
System.out.println("Please put a year");
Scanner sc=new Scanner(System.in);
int b = sc.nextInt();
if (checkYear(b)) {
	System.out.println("Is Leap Year");
}else {
	System.out.println("Is not a Leap Year");
}
}


	
	}
	


