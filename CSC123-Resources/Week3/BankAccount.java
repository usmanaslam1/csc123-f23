//Imports 
import java.util.ArrayList;

//we a create class that is public, visible to everyone
public class BankAccount {
	//fields 
	public String name;
	public short accountNumber;
	public boolean open;
	public ArrayList<Double> transactions=new ArrayList<Double>();
 	
	//constructor



public void deposit(double amount) {
			transactions.add(amount);
		
	}
	
	public void withdrawal(double amount) {
		transactions.add(amount*-1);
		
	}
	
	public void printStatement() {
		
		for(double d: transactions) {
			System.out.println(d);
		}
		
	}
	
	public double  balance() {
		return 0;
	}
	
	public void close() {
		
	}
	
	public boolean isOpen() {
		return false;
	}
}
