package by.itacademy.task1;

import by.itacademy.task1.task2.FiveException;
import by.itacademy.task1.task2.MyDivisionByZeroException;

public class Calculator {
    public static void main(String[] args) {

        CalculatorLogic calculatorLogic = new CalculatorLogic();
        System.out.println("Wright down 2 integers:");
        try {
            int firstNum = calculatorLogic.num();
            int secondNum = calculatorLogic.num();


            System.out.println("What do you want to do with this integers?" +
                    "\nChoose a math action:" +
                    "\n1. Addition." +
                    "\n2. Multiplication." +
                    "\n3. Substraction." +
                    "\n4. Division." +
                    "\n5. End of programm.");

            switch (calculatorLogic.switchInt()) {
                case 1: {
                    System.out.println(calculatorLogic.addition(firstNum, secondNum));
                    break;
                }
                case 2: {
                    System.out.println(calculatorLogic.multiplication(firstNum, secondNum));
                    break;
                }
                case 3: {
                    System.out.println(calculatorLogic.substraction(firstNum, secondNum));
                    break;
                }
                case 4: {
                    System.out.println(calculatorLogic.division(firstNum, secondNum));
                    break;
                }
                default: {
                    break;
                }
            }
        } catch (FiveException ex) {
            System.out.println("Error. 5 is not supported.");
        } catch (MyDivisionByZeroException ex) {
            System.out.println(ex.getRusMessage());
        }
    }
}
