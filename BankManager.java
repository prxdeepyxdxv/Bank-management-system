import java.util.ArrayList;

public class BankManager {

    public static void main(String[] args) {

       
        ArrayList<BankAccount> accounts = new ArrayList<>();

       
        SavingsAccount savings = new SavingsAccount("12345", "Amit Sharma", 0.02);
        CheckingAccount checking = new CheckingAccount("67890", "Riya Verma", 500.00);

      
        accounts.add(savings);
        accounts.add(checking);

       
        System.out.println("Initial Account Details:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }

        System.out.println("\n--- Transactions ---");

       
        savings.deposit(200);

     
        checking.withdraw(100);

        
        if (savings instanceof SavingsAccount) {
            savings.applyInterest();
        }

      
        System.out.println("\nFinal Account Details:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }
    }
}
