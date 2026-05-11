import java.math.BigDecimal;
import java.util.LinkedList;

public class Bank {
    private String name;
    private LinkedList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new LinkedList<>();
    }

    public void addAccount(String name, BigDecimal amt) {
        String generateAccNo;

        do {
            int randomNumber = (int) (Math.random() * 9000000) + 1000000;
            generateAccNo = String.valueOf(randomNumber);
        } while (searchAccount(generateAccNo) != null);

        Account acc = new Account(amt, name, generateAccNo);
        accounts.add(acc);

        System.out.println("Account created successfully.");
        System.out.println("Your account number is: " + generateAccNo);
    }

    public Account searchAccount(String accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void transfer(String senderAccNo, String receiverAccNo, BigDecimal amount) {
        Account sender = searchAccount(senderAccNo);
        Account receiver = searchAccount(receiverAccNo);
        if (sender == null || receiver == null) {
            System.out.println("Account not found!");
            return;
        }
        sender.transfer(receiver, amount);
    }

    public void withdraw(String accNo, BigDecimal amt) {
        Account acc = searchAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        acc.withdraw(amt);
    }

    public void deposit(String accNo, BigDecimal amt) {
        Account acc = searchAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        acc.deposit(amt);
    }

    public void displayAccountInfo(String accNo) {
        Account acc = searchAccount(accNo);
        if (acc != null) {
            acc.displayInfos();
        } else {
            System.out.println("Account not found!");
        }
    }
}