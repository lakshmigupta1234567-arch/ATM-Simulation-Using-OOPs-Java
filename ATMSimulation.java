import java.util.InputMismatchException;
import java.util.Scanner;

class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Withdrawal amount must be greater than 0");
        }if (amount > balance) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Transaction successful");
    }public double getBalance() {
        return balance;
    }
}class ATM {
    static int PIN = 1234;
    public boolean authenticate(int enteredPin) {
        return enteredPin == PIN;
    }
}
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();
        Account account = new Account(2000); // Initial Balance

        try {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (!atm.authenticate(enteredPin)) {
                System.out.println("Access Denied! Incorrect PIN.");
                return;
            }
            int choice;
            do {
                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Withdraw Money");
                System.out.println("2. Check Balance");
                System.out.println("3. Exit");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter amount: ");
                            double amount = sc.nextDouble();

                            account.withdraw(amount);

                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Balance: " + account.getBalance());
                        break;
                    case 3:
                        System.out.println("Thank you for using ATM");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } while (choice != 3);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        }
        sc.close();
    }
}