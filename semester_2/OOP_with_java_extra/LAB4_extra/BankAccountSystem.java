class BankAccountSystem{
	private int accountNumber;
	private double balance;
	private String accountType;

	BankAccountSystem(int accountNumber,double balance,String accountType){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
	}
	void deposit(double amount){
		if(amount>0){
			this.balance +=amount;
			System.out.println("Deposit Sucessful");
		}
		else 
			System.out.println("Invalid deposit");
	}
	void withdraw(double amount){
		if(amount>0 && amount<=this.balance){
			this.balance -= amount;
			System.out.println("Withdraw Sucessful");
		}
		else 
			System.out.println("Invalid Withdraw");
	}
	double convertToUSD(double rate){
		return this.balance/rate;
	}
	String[] getAccountInfoArray(){

	String[] str = {String.valueOf(this.accountNumber),String.valueOf(this.balance),accountType};
	return str;
	}

	boolean isAccountValid(){
		if(this.accountNumber>0 && this.balance >= 0){
			return true;
		}
		return false;
	}
	String getAccountStatus(){
		return (this.balance>0) ? "Active" : "Inactive";
	}

}

class Main{
	public static void main(String[] args){
		BankAccountSystem account = new BankAccountSystem(123,2050.50,"Current");

		// Depositing amount
		account.deposit(500);

		// Withdrawing amount
		account.withdraw(250);

		// Converting amount to USD
		double inUSD = account.convertToUSD(212);
		System.out.printf("Amount in USD: %.2f\n", inUSD);

		// Getting account info
		String str[] = account.getAccountInfoArray();
		System.out.printf("Account number: %s\n",str[0]);
		System.out.printf("Account balace: %s\n",str[1]);
		System.out.printf("Account Type: %s\n",str[2]);

		// Checking Account Validation
		boolean isValid = account.isAccountValid();
		System.out.println("Your Account is Valid: " + isValid);

		// Checking Account Status
		String status = account.getAccountStatus();
		System.out.println("Your Account Status: " + status);
	}
}