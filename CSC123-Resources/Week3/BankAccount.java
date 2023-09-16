//Imports 
import java.util.ArrayList;

//we a create class that is public, visible to everyone
public class BankAccount {
	//fields 
	private String name;
	private short accountNumber;
	private boolean open=true;
	private ArrayList<Double> transactions=new ArrayList<Double>();
 	
	//constructor



public void deposit(double amount) {
			if(isOpen())
			transactions.add(amount);
		
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
