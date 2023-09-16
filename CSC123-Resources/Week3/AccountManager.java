
public class AccountManager {

	public static void main(String[] args) {
		
		BankAccount myAccount=new BankAccount();
		
		myAccount.deposit(100);
		
		myAccount.deposit(101.75);
		myAccount.withdrawal(20);
		myAccount.printStatement();
		System.out.println(myAccount.balance());
		myAccount.close();
		System.out.println(myAccount.isOpen());
		myAccount.deposit(101.75);
		myAccount.withdrawal(20);
		myAccount.printStatement();
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(20);
		myAccount.withdrawal(1.75);
	
		
		System.out.println(myAccount.balance());
		
	}

}
