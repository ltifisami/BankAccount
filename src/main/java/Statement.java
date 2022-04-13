import java.util.Date;

public class Statement {
	
	private Operation operation;
	private Date dateOperation;
	private double amount;
	private double balance;
	public Operation getOperation() {
		return operation;
	}
	public Statement() {
		super();
	}
	
	@Override
	public String toString() {
		return "Statement [operation=" + operation + ", dateOperation=" + dateOperation + ", amount=" + amount
				+ ", balance=" + balance + "]";
	}
	public Statement(Operation operation, Date dateOperation, double amount, double balance) {
		super();
		this.operation = operation;
		this.dateOperation = dateOperation;
		this.amount = amount;
		this.balance = balance;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
