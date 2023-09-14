package classes.BankAccount;

import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, BankAccount> accounts = new HashMap<>();
        String ln;
        while (!(ln = scanner.nextLine()).equals("End")) {

            final String[] tokens = ln.split("\\s+");
            final String cmd = tokens[0];

            if (cmd.equals("Create")) {
                final BankAccount account = new BankAccount();
                accounts.put(account.getId(), account);
                System.out.printf("Account ID%d created%n", account.getId());
            }

            if (cmd.equals("Deposit")) {
                final int id = Integer.parseInt(tokens[1]);
                final double amount = Double.parseDouble(tokens[2]);
                final BankAccount exist = accounts.get(id);

                if (exist == null) {
                    System.out.println("Account does not exist");
                    continue;
                }

                exist.deposit(amount);
                System.out.printf("Deposited %.2f to ID%d%n", amount, id);
            }

            if (cmd.equals("GetInterest")) {
                final int id = Integer.parseInt(tokens[1]);
                final int years = Integer.parseInt(tokens[2]);
                final BankAccount exist = accounts.get(id);

                if (exist == null) {
                    System.out.println("Account does not exist");
                    continue;
                }

                final double interest = exist.getInterest(years);
                System.out.println(interest);
            }

            if (cmd.equals("SetInterest")) {
                final double amount = Double.parseDouble(tokens[1]);
                BankAccount.setInterest(amount);
            }

        }
    }
}
