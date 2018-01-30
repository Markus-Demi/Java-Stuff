package by.itacademy.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int money = 0;
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To put money choose - 1\nTo withdraw - 2");
        int i = Integer.parseInt(scanner.nextLine());

        if (i == 1) {
            System.out.println("Put money to ATM");
            atm.put(money = Integer.parseInt(scanner.nextLine()));
        } else if (i == 2) {
            System.out.println("How much to withdraw?");
            atm.withdraw(money = Integer.parseInt(scanner.nextLine()));
        } else {
            System.out.println("Incorrect");
        }
    }
}
