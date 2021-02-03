import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
public class Account {
    public Account(double balance) {
        this.balance = balance;
    }

    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public void Showbalance() {
        System.out.println("senin balansin" + ":" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("senin deposit olunmus balansin"+":"+balance);
        Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT, LocalDateTime.now());
        transactions.add(transaction);

    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("mebleg balansdan coxdur");
        } else {
            balance -= amount;
            System.out.println("senin withdraw olunmus balansin"+":"+balance);
            Transaction transaction = new Transaction(amount, TransactionType.WITHDRAW, LocalDateTime.now());
            transactions.add(transaction);
        }
    }
        public void showtransaction () {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(i);
            }

        }
    }






