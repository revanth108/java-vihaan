import java.util.*;

class Account {
    private int accountNumber;
    private String customerName;
    private double balance;
    private String accountType;
    private List<String> transactionHistory;

    public Account(int accountNumber, String customerName, double balance, String accountType) {
        // Write Your Code Here
        
    }

    public void deposit(double amount) {
        // Write Your Code Here
       
    }

    public void withdraw(double amount) {
        // Write Your Code Here
        
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void showTransactionHistory() {
        // Write Your Code Here
        
    }

    private void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }
}

public class Bank {
    private static Map<Integer, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int currentAccountNumber = -1;

    public static void main(String[] args) {
        while (true) {
            if (currentAccountNumber == -1) {
                authenticateUser();
            } else {
                showAccountMenu();
            }
        }
    }

    private static void authenticateUser() {
        System.out.println("Enter Account Number");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);
        // Write Your Code Here
        
    }

    private static void createNewAccount() {
        // Write Your Code Here
        
    }

    private static void showAccountMenu() {
        // Write Your Code Here
    }
}
