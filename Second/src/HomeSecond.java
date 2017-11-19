import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Random;

public class HomeSecond {

    public static void main(String[] args) {

        // 1. Print an array with 0 and 99 as min and max replaced num:
        int size = 10;
        int[] arr = new int[size];
        Random rand = new Random();
        int min = 0, max = 0, zero = 0, ninetyN = 99;
        for(int i = 0; i < size; i++) {
            arr[i] = rand.nextInt() % 100;

            if(min > arr[i]) {
                min = arr[i];
                arr[i] = zero;
            }
            if (max < arr[i]) {
                max = arr[i];
                arr[i] = ninetyN;
            }
        }
        String intArrStr = Arrays.toString(arr);
        System.out.println("min = " + min + "\nmax = " + max);
        System.out.println(intArrStr);

        System.out.println("\n////////////////////////////////////");

        // 2. Array of floats with repeatable nums

        int[] arrF = new int[size];

        for(int i = 0; i < size; i++) {
            arrF[i] = rand.nextInt() % 10;
        }

        for(int i = 0; i < size; i++) {

            //int repeatNums = 0;

            for(int j = i + 1; j < size; j++) {
                if(arrF[i] == arrF[j] && i != j) {
                    System.out.println("Repeated nums at element " + i + " and " + j + " in array");
                    //repeatNums++;
                }
            }
        /*    if(repeatNums > 1) {
                System.out.println("[" + arrF[i] + "]" + " - repeats " + repeatNums);
            } */
        }
        System.out.println(Arrays.toString(arrF));

        System.out.println("\n////////////////////////////////////");

        // 3. Revert an array
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 10;
        }
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i < array.length / 2 && j / 2 >= 0; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        System.out.println("Revert array: " + Arrays.toString(array));

        /*

4. Написать программу, определяющую, образуют ли цифры некоторого числа строго возрастающую последовательность.
Например: 123 – образуют, 212 – не образуют.

5.Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию). Р
езультат вывести на экран.

         */

    }
}
