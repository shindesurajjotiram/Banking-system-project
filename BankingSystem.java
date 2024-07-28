package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount savings = new SavingsAccount("123456", "John Doe", 100.0, 0.02);
        savings.deposit(500);
        savings.withdraw(2);
        savings.displayAccountDetails();
        System.out.println("Interest: " + savings.calculateInterest());
        System.out.println();
        // Create a checking account
        CheckingAccount checking = new CheckingAccount("654321", "Jane Smith", 0.0, 500.0);
        checking.deposit(150);
        checking.withdraw(100);
        checking.displayAccountDetails();
        System.out.println("Interest: " + checking.calculateInterest());
    }
}
