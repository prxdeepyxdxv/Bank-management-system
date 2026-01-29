public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

   
    public CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

   
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        double newBalance = getBalance() - amount;

        if (newBalance < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            setBalance(newBalance);
            if (newBalance < 0) {
                System.out.println("Overdraft used. Current balance: $" 
                        + String.format("%.2f", newBalance));
            }
        }
    }

    @Override
    public String getAccountDetails() {
        return "Checking Account #" + getAccountNumber()
                + ", Balance: $" + String.format("%.2f", getBalance())
                + ", Limit: $" + String.format("%.2f", overdraftLimit);
    }
}
