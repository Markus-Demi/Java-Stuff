package by.itacademy.task;

import java.util.Scanner;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        int[] array = new int[10];
        int index = 0;


        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1: {
                for (int i = 0; i < 10000; i++) {
                    array[index] = i;
                    if (i % 10 == 0) {
                        Main.print10(array);
                        array = new int[10];
                        index = 0;
                    } else {
                        index++;
                    }
                }
                break;
            }
            case 2: {
                for (int i = 0; i < 10000; i++) {
                    array[index] = i;
                    if (i % 10 == 0) {
                        Main.printSynchronyzed10(array);
                        array = new int[10];
                        index = 0;
                    } else {
                        index++;
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }
}
