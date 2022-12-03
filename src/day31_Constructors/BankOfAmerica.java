package day31_Constructors;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("HALID ERDUR", 11223344);

        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(200);
        account1.checkBalance();
        System.out.println(account1);

        System.out.println("-------------------------------------------------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("LIONEL MESSI", 22554411);

        System.out.println(account2);

        account2.deposit(1500);
        account2.checkBalance();

        account2.withdraw(200);
        account2.checkBalance();
        System.out.println(account2);


    }
}
