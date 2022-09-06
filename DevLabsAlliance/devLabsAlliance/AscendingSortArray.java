package devLabsAlliance;

import java.util.Arrays;

public class AscendingSortArray {

	public AscendingSortArray() {
		// 3. Write a program to sort the elements of an array in ascending order. 
	}

	public static void main(String[] args) {
int []arr=new int[] {12,5,4,16,9,0};
System.out.println("Elements originaly in array are:");
for(int i=0; i<arr.length; i++){
	System.out.println(arr[i]+"");
	
}
	Arrays.sort(arr);	
	System.out.println("Elements in array in ascending order are:"+Arrays.toString(arr));
	}

}
