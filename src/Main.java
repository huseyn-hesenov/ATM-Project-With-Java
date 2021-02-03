import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ATM proqramin oxs geldin");
        System.out.println("$$$$$$$$$$$$$");
        System.out.println("secimini et");
        String[] secimler = {"BALANCE", "DEPOSIT", "WITHORAM", "TRANSACTIONS", "EXIT"};
        Account myAccount = new Account(100);
        int secim;
        double amount;
        do {
            for (int i = 0; i < secimler.length; i++) {
                System.out.println(i + 1 + "." + secimler[i]);
            }
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    myAccount.Showbalance();
                    break;
                case 2:
                    System.out.println("deposit megleg");
                    amount = scanner.nextDouble();
                    myAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("withdraw mebleg");
                    amount = scanner.nextDouble();
                    myAccount.withdraw(amount);
                    break;
                case 4:
                    myAccount.showtransaction();
                    break;
                case 5:
                    System.out.println("bye bye");
                default:
                    System.out.println("duzgun secim edin");
            }

        } while (secim != 5);

    }
}
