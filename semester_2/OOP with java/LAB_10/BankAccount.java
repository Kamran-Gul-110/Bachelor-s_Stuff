class BankAccount {
    private String accountNumber;
    private String holderName;

    public BankAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
    }

    public double annualInterestRate() {
        return 0.5; // 0.5%
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    @Override
    public double annualInterestRate() {
        return 4.0; // higher interest
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    @Override
    public double annualInterestRate() {
        return 0.0; // no interest
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("001", "Ali");
        SavingsAccount s = new SavingsAccount("002", "Ahmed");
        CurrentAccount c = new CurrentAccount("003", "Sara");

        System.out.println("=== Bank Account ===");
        b.display();
        System.out.println("Interest: " + b.annualInterestRate());

        System.out.println("\n=== Savings Account ===");
        s.display();
        System.out.println("Interest: " + s.annualInterestRate());

        System.out.println("\n=== Current Account ===");
        c.display();
        System.out.println("Interest: " + c.annualInterestRate());
    }
}