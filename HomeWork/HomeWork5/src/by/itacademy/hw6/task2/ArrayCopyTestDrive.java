package by.itacademy.hw6.task2;

import java.util.Random;

public class ArrayCopyTestDrive {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = rnd.nextInt() % 10;
        }
        for (int i = 0; i < 20; i++) {
            arr2[i] = 0;
        }

        System.arraycopy(arr1, 0, arr2, 5, 10);
        for (int i = 0; i < 20; i++) {
            System.out.print(arr2[i] + ", ");
        }
    }
}
