package inheritance;

public class CurrentAccount extends Account{
	private double overDraftLimit=10000;
	public boolean checkoverDraftLimit(double balance) {
		if(balance<=overDraftLimit) {
			return true;
		}
		return false;
	}

}
