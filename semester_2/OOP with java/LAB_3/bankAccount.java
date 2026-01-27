class bankAccount{
	private String accountNumber;
	private String accountHolder;
	private double balance;

	bankAccount(String accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	void depositAmount(double balance){
		if(balance>=0){
			this.balance = this.balance + balance;
		}
		
	}

	void withdrawAmount(double amount){
		if(amount>0 && amount <=this.balance){
			this.balance = this.balance - amount;
		}
		
	}

	double getBalance(){
		return this.balance;
	}

	void printStatement(){
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Holder: " + this.accountHolder);
		System.out.println("Current Balance: " + this.balance);
	}

	public static void main(String[] args){
		bankAccount account = new bankAccount("PK25004567AB339","Kamran Gul",3489.98);
		
		account.depositAmount(5000);
		account.withdrawAmount(3400);
		account.printStatement();

		System.out.print("\n");

		account.depositAmount(300.76);
		account.withdrawAmount(10000);
		account.printStatement();

		System.out.print("\n");
		
		account.depositAmount(45360.76);
		account.withdrawAmount(13349.59);
		account.printStatement();
		
	}
}