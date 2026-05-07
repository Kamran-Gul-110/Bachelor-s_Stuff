class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Invalid balance");
        }

        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit");
        }

        balance = balance + amount;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdraw");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("No funds");
        }

        balance = balance - amount;
    }

    public void transferTo(BankAccount other, double amount)
            throws InsufficientFundsException {

        withdraw(amount);
        other.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    public static BankAccount accountWithHigherBalance(
            BankAccount x, BankAccount y) {

        if (x.getBalance() >= y.getBalance()) {
            return x;
        } else {
            return y;
        }
    }

    public String toString() {
        return "Balance = " + balance;
    }
}

class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(200);
        BankAccount a2 = new BankAccount(100);

        try {
            a1.withdraw(50);
            System.out.println(a1);

            a2.withdraw(300);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        a1.deposit(100);
        a2.deposit(20);

        try {
            a1.transferTo(a2, 70);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a1);
        System.out.println(a2);

        BankAccount high =
            BankAccount.accountWithHigherBalance(a1, a2);

        System.out.println(high);
    }
}