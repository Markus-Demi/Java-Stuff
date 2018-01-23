package by.itacademy.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println("Press 1 - to wright a string\n0 - exit.");
        Scanner inputScanner = new Scanner(System.in);
        int input = 1;
        while (input == 1) {
            input = inputScanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Your string: ");
                    String string = inputScanner.next();
                    stringArrayList.add(string);
                    System.out.println("Press 1 - to wright a string\n0 - exit.");
                    break;
                case 0:
                    break;
            }
        }
        ArrayList<String> convertArrayListString = getArrayWithoutCharacter(stringArrayList);
        System.out.println("\nMassive of strings:");
        printArrayList(stringArrayList);
        System.out.println("\nResult: ");
        printArrayList(convertArrayListString);
    }

    private static ArrayList<String> getArrayWithoutCharacter(ArrayList<String> inputArrayListString) {
        ArrayList<String> arrayListString = new ArrayList<>();
        for (String string : inputArrayListString) {
            arrayListString.add(string.replace("a", ""));
        }
        return arrayListString;
    }

    private static void printArrayList(ArrayList<String> arrayList) {
        for (String string : arrayList) {
            System.out.print(string + " ");
        }
    }

}