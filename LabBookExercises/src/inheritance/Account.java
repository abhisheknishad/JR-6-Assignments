package inheritance;

public class Account {
	private static long accountNo=1000100001;
	long accNo;
	double balance;
	Person accHolder;
	public Account() {
		this(0.0,null);
	}
	public Account(double balance, Person accHolder) {
		setAccNo(generateAccountNo());
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = generateAccountNo();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	void deposit(double balance) {
		this.balance+=balance;
	}
	void withDraw(double balance) {
		this.balance-=balance;
	}
	long generateAccountNo() {
		 accountNo+=100001;
		 return accountNo;
	}
	
}
