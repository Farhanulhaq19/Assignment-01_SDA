package basic_oop.task2;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("-------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("=== TASK 2: Encapsulation ===");
        BankAccount account = new BankAccount();
        account.setAccountNumber("ACC-123456");
        account.setBalance(5000.00);
        account.displayAccountDetails();
    }
}