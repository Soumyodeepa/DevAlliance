package labExercises;

public class Printnumber {

	static int print;

	public static void main(String[] args) {

		pattern2();

	}

	public static void pattern1() {

		print = 1;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				if (print <= 9) {
					System.out.print(print++);
				} else {
					print = 0;
					System.out.print(print);
				}
			}
			System.out.println();
		}
	}

	public static void pattern2() {
		print = 0;
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(print++);
			}
			System.out.println();
		}
	}

	public Printnumber() {
		// TODO Auto-generated constructor stub
	}
}
