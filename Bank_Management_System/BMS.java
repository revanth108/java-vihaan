import java.text.SimpleDateFormat;
import java.util.*;

class Account {
     //Write your code Define Variables 

    public Account(int accountNumber, String customerName, double balance, String accountType, String password) {
        //Write your code for constructor
        
    }
    public void deposit(double amount) {
        //Write your code
    }

    public void withdraw(double amount) {
        //Write your code
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
    public boolean authenticate(String enteredPassword) {
        return this.password.equals(enteredPassword);  
    }

    public void showTransactionHistory() {
        //Write your code
    }

    private void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public void addInterest() {
        //Write your code
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    // Transfer money to another account
    public void transferMoney(Account recipient, double amount) {
        //Write your code
    }

    // Loan-related methods
    public void applyForLoan(String loanType, double loanAmount, Date dueDate) {
        //Write your code
    }

    public Loan getLoan() {
        return loan;
    }

    // Card-related methods
    public void requestCard() {
        //Write your code
    }

    public void blockCard() {
        //Write your code
    }

    public void unfreezeCard() {
        //Write your code
    }

    public void updateCardLimit(double newLimit) {
        //Write your code
    }

    
    public void requestBalanceCertificate() {
        addTransaction("Balance certificate requested.");
        System.out.println("Balance certificate requested.");
    }

    public void requestAccountClosure() {
        addTransaction("Account closure requested.");
        System.out.println("Account closure requested.");
    }

    public void raiseComplaint(String complaint) {
        addTransaction("Complaint raised: " + complaint);
        System.out.println("Complaint raised: " + complaint);
    }

    public List<String> getAlerts() {
        return transactionHistory;  
    }
}

class Loan {
    //Write your code Define your variables

    public Loan(String loanType, double amount, Date dueDate) {
        //Write your code
    }

    public String getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void makePayment(double paymentAmount) {
        //Write your code
    }

    @Override
    public String toString() {
        return "Loan Type: " + loanType + ", Amount: " + amount + ", Due Date: " + dueDate + ", Status: " + status;
    }
}

class Card {
    //Write your code Define variables

    public Card(String cardNumber, double limit) {
        //Write your code
    }

    public void block() {
        blocked = true;
        System.out.println("Card blocked.");
    }

    public void unfreeze() {
        frozen = false;
        System.out.println("Card unfrozen.");
    }

    public void updateLimit(double newLimit) {
        limit = newLimit;
        System.out.println("Card limit updated to: " + limit);
    }
}

public class BMS {
    private static Map<Integer, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int currentAccountNumber = -1;
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args) {
        while (true) {
            if (currentAccountNumber == -1) {
                System.out.println("1. User Login");
                System.out.println("2. Admin Login");
                int loginChoice = scanner.nextInt();
                if (loginChoice == 1) {
                    authenticateUser();
                } else if (loginChoice == 2) {
                    authenticateAdmin();
                }
            } else {
                showUserMenu();
            }
        }
    }

    private static void authenticateUser() {
        System.out.println("Enter Account Number:");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);

        if (account != null) {
            //Write your code
        } else {
            System.out.println("Invalid Account Number.");
        }
    }

    private static void showUserMenu() {
        Account account = accounts.get(currentAccountNumber);
        int choice;
        do {

            //Write your code Using Switch case

        } while (choice != 11);
    }
    
    private static void applyForLoan(Account account) {
        if (account.getLoan() == null) {
            //Write your code
        } else {
            System.out.println("You already have an existing loan.");
        }
    }

    private static void loanServices(Account account) {
        Loan loan = account.getLoan();
        if (loan != null) {
           
            //Write your code

        } else {
            System.out.println("No active loan.");
        }
    }

    private static void cardManagement(Account account) {
        System.out.println("1. Request Card\n2. Block Card\n3. Unfreeze Card\n4. Update Card Limit");
        int choice = scanner.nextInt();
        switch (choice) {
            //Write your code 
        }
    }

    private static void serviceRequests(Account account) {
        System.out.println("1. Request Balance Certificate\n2. Request Account Closure\n3. Raise Complaint");
        int choice = scanner.nextInt();
        switch (choice) {
            //Write your code
        }
    }

    private static void checkAlerts(Account account) {
        System.out.println("Alerts: ");
        List<String> alerts = account.getAlerts();
        if (alerts.isEmpty()) {
            System.out.println("No alerts.");
        } else {
            for (String alert : alerts) {
                System.out.println(alert);
            }
        }
    }
    private static void transferMoney(Account senderAccount) {
        System.out.println("Enter recipient's Account Number:");
        int recipientAccountNumber = scanner.nextInt();
        Account recipientAccount = accounts.get(recipientAccountNumber);
        
        if (recipientAccount != null && recipientAccountNumber != senderAccount.getAccountNumber()) {
            //Write your code
        } else {
            System.out.println("Invalid recipient account number or cannot transfer to the same account.");
        }
    }

    private static void authenticateAdmin() {
        //Write your code
    }

    private static void showAdminMenu() {
        int choice;
        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add New Account\n2. View All Accounts\n3. View Account Details\n4. Logout");
            choice = scanner.nextInt();

            switch (choice) {
               //Write your code
            }
        } while (choice != 4);
    }

    private static void addNewAccount() {
       //Write your code
    }
    
    private static void viewAllAccounts() {
        //Write your code
    }

    private static void viewAccountDetails() {
        System.out.println("Enter Account Number:");
        int accountNumber = scanner.nextInt();
        Account account = accounts.get(accountNumber);

        if (account != null) {
            //Write your code
    }
}
