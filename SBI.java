package labExercises;

public class SBI implements Bank {

	double rateofinterest = 7.5;

	public SBI() {

	}

	@Override
	public double getInterest() {
		return rateofinterest;
	}

}
