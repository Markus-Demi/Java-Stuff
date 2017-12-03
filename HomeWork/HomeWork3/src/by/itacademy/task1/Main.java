package com.gmail.m4rk.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrSize = 10;
        int[] randArr = new int[arrSize];
        inputArray(randArr);
        printArray(randArr);
        Arrays.sort(randArr);
        printArray(randArr);

        System.out.println("\n--------------------\n");

        inputArray(randArr);
        printArray(randArr);
        arrayBubbleSort(randArr);
        printArray(randArr);

        System.out.println("\n--------------------\n");

        int startIndex = 0;
        int lastIndex = arrSize - 1;
        inputArray(randArr);
        printArray(randArr);
        arrayQuickSort(startIndex, lastIndex, randArr);
        printArray(randArr);
    }

    private static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a few number:");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
    private static void arrayBubbleSort(int[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

    }
    private static void arrayQuickSort(int start, int end, int[] array) {
        if(start >= end) {
            return;
        }
        int i = start, j = end;
        int current = i - (i - j) / 2;
        while(i < j) {
            while(i < current && (array[i] <= array[current])) {
                i++;
            }
            while(j > current && (array[current] <= array[j])) {
                j--;
            }
            if(i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if(i == current) {
                    current = j;
                } else if (j == current) {
                    current = i;
                }
            }
        }
        arrayQuickSort(start, current, array);
        arrayQuickSort(current + 1, end, array);

    }
    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
