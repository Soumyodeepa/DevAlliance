package labExercises;

public class ICICI implements Bank {

	double rateofinterest = 8.5;

	public ICICI() {
	}

	@Override
	public double getInterest() {
		return rateofinterest;
	}
}
