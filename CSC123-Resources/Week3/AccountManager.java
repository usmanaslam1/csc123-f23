
public class AccountManager {

	public static void main(String[] args) {
		
		BankAccount myAccount=new BankAccount();
		
		myAccount.deposit(100);
		
		myAccount.deposit(101.75);
		myAccount.withdrawal(20);
		myAccount.printStatement();

	}

}
