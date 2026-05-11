import java.math.BigDecimal;
import java.util.Scanner;

public class BankProgramming {
    public static void main(String[] args) {
        Bank bank = new Bank("Yoon Ei Phyo");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            displayMenu(); // this menu will appear first when the program runs
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            // Checking the user input from the menu
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                continue;
            }

            switch (choice) {
                // To view account details
                case 1:
                    System.out.print("Enter account number: ");
                    String accInfo = scanner.nextLine();
                    bank.displayAccountInfo(accInfo);
                    break;

                // To transfer money
                case 2:
                    System.out.print("Enter sender account number: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter receiver account number: ");
                    String receiver = scanner.nextLine();
                    System.out.print("Enter amount to transfer: ");
                    BigDecimal transferAmt = scanner.nextBigDecimal();
                    scanner.nextLine();
                    bank.transfer(sender, receiver, transferAmt);
                    break;

                // Deposit
                case 3:
                    System.out.print("Enter account number: ");
                    String depAcc = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    BigDecimal depAmt = scanner.nextBigDecimal();
                    scanner.nextLine();
                    bank.deposit(depAcc, depAmt);
                    break;

                // Withdraw
                case 4:
                    System.out.print("Enter account number: ");
                    String wdAcc = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    BigDecimal wdAmt = scanner.nextBigDecimal();
                    scanner.nextLine();
                    bank.withdraw(wdAcc, wdAmt);
                    break;

                // To open new account
                case 5:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    // System.out.print("Enter your account number: ");
                    // String accNo = scanner.nextLine();
                    System.out.print("Enter initial amount: ");
                    BigDecimal initAmt = scanner.nextBigDecimal();
                    scanner.nextLine();
                    bank.addAccount(name, initAmt);
                    break;

                // To exit
                case 6:
                    System.out.println("Thank you for using our bank system.");
                    scanner.close();
                    return;

                // When the user tpye the wrong number
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /*
     * this is the method to display all the menu when the program starts
     */
    public static void displayMenu() {
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. View account details");
        System.out.println("2. Transfer money");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Open a new account");
        System.out.println("6. Exit");
    }
}