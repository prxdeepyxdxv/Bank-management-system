public class SavingsAccount extends BankAccount {

    private double interestRate; // e.g., 0.02 = 2%

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

   
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    
    @Override
    public String getAccountDetails() {
        return "Savings Account #" + getAccountNumber()
                + ", Balance: $" + String.format("%.2f", getBalance())
                + ", Rate: " + (interestRate * 100) + "%";
    }
}
