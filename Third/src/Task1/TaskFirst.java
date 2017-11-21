package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        int arrSize = 10;
        int[] randArr = new int[arrSize];
        inputArray(randArr);
        printArray(randArr);
        Arrays.sort(randArr);
        printArray(randArr);
    }

    private static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a few number:");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    public static void arrayBubbleSort(int[] array) {

    }
    public static void arrayQucikSort(int[] array) {

    }
    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
