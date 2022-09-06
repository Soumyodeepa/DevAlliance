package devLabsAlliance;

import java.util.Scanner;

public class AreaofATriangle {

	public AreaofATriangle() {
	//	6. Write a program to calculate the area of a triangle. Users will enter the
//		values for base and height of the triangle.	}
	}
	public static void main (String[] args) {
		//AreaofATriangle AR = new AreaofATriangle();
		System.out.println("Enter the base");
		Scanner sc=new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.println("Enter the height");
		float b = sc.nextFloat();

 
Object area = (a*b)/2;
System.out.println("Area of triangle: "+area);
	}

}

