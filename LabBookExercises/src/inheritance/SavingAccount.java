package inheritance;

public class SavingAccount extends Account {
	private double  minBalance=500;

	@Override
	void withDraw(double balance) {
		if(balance>minBalance) {
			this.balance-=balance;
		}
		else {
			System.out.println("Amount can't be withdraw as it reaches minimum Balance");
		}
	}

}
