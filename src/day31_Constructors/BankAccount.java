package day31_Constructors;

/*
BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber, 3. balance
        Actions:
                1. setInfo(): sets the accountHolder and accountNumber attributes
                2. toString()
                3. checkBalance():displays the available balance
                4. deposit(): increases the balance by the given amount
                5. withdraw(): decreases the balance by the given amount
 */
public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder= '" + accountHolder + '\'' +
                ", accountNumber= " + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance() {
        System.out.println("Your available balance is: $" + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Deposit amount can not be ZERO or less than ZERO");
            return; // exits the method
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.err.println("Insufficient balance");
            return;
        }
        if (amount <= 0) {
            System.err.println("Withdraw amount can not be ZERO or less than ZERO");
            return;
        }
        balance -= amount;
    }
}
