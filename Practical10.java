// Practical 10: Encapsulation Using Getters, Setters, and Validation
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double openingBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (openingBalance >= 0) this.balance = openingBalance;
        else throw new IllegalArgumentException("Opening balance cannot be negative");
    }

    String getAccountHolder() { return accountHolder; }
    String getAccountNumber() { return accountNumber; }
    double getBalance() { return balance; }

    boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return false;
        }
        balance += amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class Practical10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aman", "ACC1001", 5000);
        account.deposit(1500);
        account.deposit(-200);
        account.withdraw(1000);
        account.withdraw(10000);
        account.withdraw(0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Updated balance: Rs. " + account.getBalance());
    }
}
// Private fields prevent direct outside modification. Public methods validate
// transactions before changing balance, preserving a valid object state.
