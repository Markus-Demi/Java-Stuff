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

        System.out.println("\n////////////////////////////////////\n");

        // 2. Array of floats with repeatable nums

        int[] arrF = new int[size];

        for(int i = 0; i < size; i++) {
            arrF[i] = rand.nextInt() % 10;
        }
        Arrays.sort(arrF);

        int numb = 0;
        int countRepeat;
        int maxRepeat = 0;

        System.out.println(Arrays.toString(arrF));

        for (int i = 0; i < arrF.length; i++) {
            countRepeat = 1;

            for (int j = i + 1; j < arrF.length; j++) {
                numb = arrF[i];

                if (arrF[i] == arrF[j] && (j != i)) {
                    countRepeat++;
                }
            }

            if((maxRepeat <= countRepeat) && (countRepeat != 1)){
                maxRepeat = countRepeat;
                System.out.println("[" + numb + "] - repeats " + maxRepeat);
            }
        }

        System.out.println("\n////////////////////////////////////\n");

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

        System.out.println("\n////////////////////////////////////\n");

        // 4. Number sequence
        int[] numSeq = new int[size];
        for(int i = 0; i < size; i++) {
            numSeq[i] = rand.nextInt() % 100;//(int)(Math.random() * 90 + 10);
        }
        //Arrays.sort(numSeq);
        System.out.println(Arrays.toString(numSeq));
        for(int i = 1; i < size; i++) {
            if(numSeq[i - 1] >= numSeq[i]) {
                System.out.println("Progression non increasing");
                break;
            }
            if(i == numSeq.length - 1) {
                System.out.println("Increasing");
            }
            //System.out.println((i < numSeq.length) ? "NO" : "YES");
        }

        System.out.println("\n////////////////////////////////////\n");

        // 5. Array sort

        int[] arrSort = new int[size];
        for (int i = 0; i < size; i++) {
            arrSort[i] = rand.nextInt() % 100;
        }
        System.out.println("Before any sort:\n" + Arrays.toString(arrSort));

        //Arrays.sort(arrSort);

        //System.out.println("After Arrays.sort() sort:\n" + Arrays.toString(arrSort));
        // bubble:
        /*
        for(int i = size - 1; i > 0; i--) {
            int tmp;
            for (int j = 0; j < i; j++) {
                if(arrSort[j] > arrSort[j + 1]) {
                    tmp = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = tmp;
                }
            }
        }
        System.out.println("After bubble sort:\n" + Arrays.toString(arrSort));
        */

        // quick sort:
        int startIndex = 0;
        int lastIndex = size - 1;
        qSort(startIndex, lastIndex, arrSort);
        System.out.println("After qsort:\n" + Arrays.toString(arrSort));
    }

    private static void qSort(int start, int end, int[] array) {
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
        qSort(start, current, array);
        qSort(current + 1, end, array);
    }
}
