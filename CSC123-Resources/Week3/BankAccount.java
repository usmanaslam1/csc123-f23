//Imports 
import java.util.ArrayList;

//we a create class that is public, visible to everyone
public class BankAccount {
	//fields 
	
	private  String name="Default Name";
	private int accountNumber=1000;
	private boolean open=true;
	private ArrayList<Double> transactions=new ArrayList<Double>();
	//constructor

	public BankAccount(String name, int accountNumber) {
		
		System.out.println(this.name);
		
		//name=name;
		//accountNumber=accountNumber;
		
	}

	public  void deposit(double amount) {
			//if(isOpen())
		//	transactions.add(amount);

			
		
	}
	
	public void withdrawal(double amount) {
		if(balance()-amount>=0)
		transactions.add(amount*-1);
		
	}
	
	public void printStatement() {
		
		for(double d: transactions) {
			System.out.println(d);
		}
		
	}
	
	public double  balance() {
		double startingBalance=0;
		for(double t:transactions) {
			
			startingBalance+=t;
		}
		return startingBalance;
	}
	
	public void close() {
		open=false;
		
	}
	
	public boolean isOpen() {
		return open;
	}
}
