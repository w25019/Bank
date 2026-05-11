import java.math.BigDecimal;

class Account {
    BigDecimal balance;
    String name;
    String accNo;

    Account(BigDecimal balance, String name, String accNo) {
        this.balance = balance;
        this.name = name;
        this.accNo = accNo;
    }

    /*
     * this is the method to display the details of owner's account
     */
    public void displayAcc() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance + " kyats");
    }

    /*
     * this is the method to get the name of owner
     */
    public String getOwner() {
        return name;
    }

    /*
     * this is the method to get the ower of bank account number
     */
    public String getAccountNumber() {
        return accNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    /*
     * This is the method to show the balance
     */
    public void checkBalance() {
        System.out.println("Your balance is " + balance + " kyats");
    }

    /*
     * this is the method to add(deposit) money to the account
     */
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
            System.out.println("Deposit amount: " + amount + " kyats");
            System.out.println("Your Balance is " + balance + " kyats");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    /*
     * this is the method to withdraw money from the account
     */
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) <= 0) {
            balance = balance.subtract(amount);
            System.out.println("Withdraw amount: " + amount + " kyats");
            System.out.println("Your Balance is " + balance + " kyats");
        } else {
            System.out.println("It's unavailable to withdraw. Please check your balance.");
        }
    }

    /*
     * this is the method for transferring money
     */
    public void transfer(Account receiver, BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(this.balance) <= 0) {
            this.balance = this.balance.subtract(amount);
            receiver.balance = receiver.balance.add(amount);
            System.out.println("Transferred " + amount + " kyats to " + receiver.name);
        } else {
            System.out.println("Transfer failed. Check amount and balance.");
        }
    }

    /*
     * this is the method for displaying the dedails of account holder
     */
    public void displayInfos() {
        System.out.println("Name: " + this.name);
        System.out.println("Account number: " + this.accNo);
        System.out.println("Total Balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account{name='" + name + "', accNo='" + accNo + "', balance=" + balance + " kyats}";
    }
}
