package labExercises;

public class BankImpl {

	public static void main(String[] args) {

		SBI bankA = new SBI();
		ICICI bankB = new ICICI();
		System.out.println("SBI ROI is " + bankA.getInterest());
		System.out.println("ICICI ROI is " + bankB.getInterest());
		//
		//

	}

	// CONSTRUCTOR
	public BankImpl() {
	}

}
