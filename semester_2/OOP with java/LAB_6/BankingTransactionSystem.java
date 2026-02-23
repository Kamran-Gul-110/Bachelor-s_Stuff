class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;
	private double[] transactionHistory = new double[20];
	private int transactionCount=0;

	BankAccount(String accountNumber,String accountHolderName,double initialBalance,String accountType){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
		this.accountType = accountType;
	}
	void recordTransaction(double amount){
		int count = transactionCount % transactionHistory.length;
		transactionHistory[count] = amount;
		transactionCount++;
	}
	void depositAmount(double amount){
		if(amount>=0){
			this.balance += amount;
			recordTransaction(amount);
			System.out.println("Cash Deposit Successful");
		}
		else 
			System.out.println("Cash Deposit Failed");
	}
	void withdrawAmount(double amount){
		if(amount>=0 && amount <= this.balance){
			this.balance -= amount;
			recordTransaction(-(amount));
			System.out.println("Cash Withdraw Successful");
		}
		else 
			System.out.println("Cash Withdraw Failed");
	}
	void transfer(BankAccount other, double amount){
		if(amount <= this.balance){
		other.balance +=amount;
		other.recordTransaction(amount);
		this.balance -= amount;
		this.recordTransaction(-(amount));
		System.out.println("Cash Transfered Successfully");
	}
	else 
		System.out.println("Cash Transfer Failed");
	}
	double calculateInterest(){
		if(this.accountType.equals("Current")){
			return (0.5/100)*this.balance;
		}
		else 
			return (2/100)*this.balance;
	}
	void applyInterest(){
		this.balance += calculateInterest();
	}
	double getBalance(){
		return balance;
	}
	double[] getTransactionHistory(){
		return transactionHistory;
	}
	String accountSummary(){
		String str = String.format("\nAccount Number: %s \nAccount Holder Name: %s \nAccountType: %s \nCurrent Balance: %.2f",accountNumber,accountHolderName,accountType,balance);
		return str;
	}
}
class Main{
	public static void main(String[] args){
		BankAccount a1 = new BankAccount("123","kamran",5030.5,"Current");
		BankAccount a2 = new BankAccount("456","Ali",45029.9,"Saving");
		System.out.println("\n");
		a1.withdrawAmount(500.56);
		a1.depositAmount(300.78);
		a1.applyInterest();

		a1.transfer(a2,1200);
		a1.transfer(a2,340.20);
		a2.transfer(a2,15000);

		String summary1 = a1.accountSummary();
		String summary2 = a2.accountSummary();
		System.out.println(summary1);

		System.out.println("\nTransaction History");
		double[] history1 = a1.getTransactionHistory();
		for(double i:history1){
			if(i!=0){
			System.out.println(i);
		}}

		System.out.println("\n----------------------------------------");
		System.out.println(summary2);

		System.out.println("\nTransaction History");
		double[] history2 = a2.getTransactionHistory();
		for(double i:history2){
			if(i!=0){
			System.out.println(i);
		}}

	}
}