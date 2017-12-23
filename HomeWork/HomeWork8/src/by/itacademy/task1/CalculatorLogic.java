package by.itacademy.task1;

import by.itacademy.task1.task2.FiveException;
import by.itacademy.task1.task2.MyDivisionByZeroException;

import java.util.Scanner;

public class CalculatorLogic {
    private Scanner scanner = new Scanner(System.in);


    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int substraction(int num1, int num2) {
        return num1 - num2;
    }

    public int division(int num1, int num2) throws MyDivisionByZeroException {
        if(num2 == 0) {
            throw new MyDivisionByZeroException("Division by zero! Such wrooooooooooooong!");
        }
        return num1 / num2;
    }

    public int switchInt() {
        return scanner.nextInt();
    }

    public int num() throws FiveException {
        int num = 0;
        if(scanner.hasNext()) {
            num = scanner.nextInt();
            if(num == 5) {
                throw new FiveException();
            }
        }
        return num;
    }
}
