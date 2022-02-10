package OOP.application;

import java.util.Scanner;

import OOP.entities.Account;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int accountID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter inicial deposit value: ");
            double balance = sc.nextDouble();
            acc = new Account(accountID, holder, balance);
        } else {
            acc = new Account(accountID, holder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(acc.toString());
        System.out.println();
        System.out.print("Enter a deposit value: $ ");
        double value = sc.nextDouble();
        acc.deposit(value);
        System.out.println("Updated account data:");
        System.out.println(acc.toString());
        System.out.println();
        System.out.print("Enter a withdraw value: $ ");
        value = sc.nextDouble();
        acc.withdraw(value);
        System.out.println("Updated account data:");
        System.out.println(acc.toString());
        System.out.println();

        sc.close();
    }
}
