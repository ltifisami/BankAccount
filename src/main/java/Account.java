import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Account {
	private double balance;
	private List<Statement> history = new ArrayList<Statement>();
	
	public  double getBalance()
	{
		return balance;
	}
	public double getOverdraftLimit()
	{
		return balance;
	}
	
	public Account(double balance)
	{
		if(balance <0) this.balance=0.0;
		else
		{
			this.balance=balance;
		}
		
	}
	

	public List<Statement> getHistory() {
		return history;
	}
	
	public boolean withdraw(double amount)
	{
		if(amount <0 || amount > balance) {
			return false;
		}
		{
			Statement st= new Statement(Operation.CREDIT, new Date(), amount, balance);
			this.history.add(st);
			this.balance-=amount;
			return true;
		}
		
	}
	
	public boolean deposit(double amount) 
	{
		if(amount <0) {
			return false;
		}
		{	
			Statement st= new Statement(Operation.DEBIT, new Date(), amount, balance);
			this.history.add(st);
			balance+=amount;
			return true;
		}
			
	}
	
	public void printHistory()
	{
		for (Statement statement : history) {
			System.out.println(statement.toString());
		} 
	}
	
	
	
}
