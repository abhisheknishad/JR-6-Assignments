package inheritance;

public class AccountMain {

	public static void main(String[] args) {
		AccountMain app= new AccountMain();
		app.start();
	}
	void start() {
		Person smith=new Person("Smith",20);
		Person kathy = new Person("Kathy",22);
		Account ac1=new Account(2000,smith);
		Account ac2= new Account(3000,kathy);
		System.out.println("----A/C details before updation----");
		display(ac1);
		display(ac2);
		ac1.deposit(2000);
		ac2.withDraw(2000);
		System.out.println("\n----A/C details after updation----");
		display(ac1);
		display(ac2);
	}
	void display(Account accountHolder) {
		System.out.println("Name: "+accountHolder.getAccHolder().name+"  A/c no: "+accountHolder.getAccNo()+"  Balance:"+accountHolder.getBalance());
	}

}
