package by.itacademy.task2;

import java.util.Scanner;

/**
 * ATM
 */
public class Main {
    public static void main(String[] args) {
        BelATM belATM = new BelATM();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. If you want to put some cash to ATM press 1.\n" +
                "2. If you want to out some cash from ATM press 2.\n" +
                "3. If you want to see bank account press 3.\n" +
                "4. If you want to exit from menu press any button.");
        while(true) {
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("How much money do you want to put in? (enter number)");
                    belATM.putCash(sc.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("How much money do you want to out? (enter number)");
                    belATM.outCash(sc.nextInt());
                    break;
                }
                case 3: {
                    belATM.showMoney();
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }
}
