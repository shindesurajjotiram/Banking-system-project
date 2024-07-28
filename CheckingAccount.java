package bankingsystem;

class CheckingAccount extends Account implements Transaction {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Checking accounts typically don't have interest
        return 0.0;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Checking Account");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds to withdraw");
        }
    }
}
