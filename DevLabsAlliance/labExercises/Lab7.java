package labExercises;

public class Lab7 {

	public static void main(String[] args) {
		Lab7 perimeterSQ = new Lab7();
		// perimeterSQ.getPerimeter(8);
		System.out.println("Perimeter of Square = " + perimeterSQ.getPerimeter(8));
		Lab7 perimeterRT = new Lab7();

		System.out.println("Perimeter of Rectangle = " + perimeterRT.getPerimeter(5, 9));

	}

	public int getPerimeter(int s) {
		return s * 4;
	}

	public int getPerimeter(int l, int b) {
		return (l + b) * 2;

	}
}