import com.sun.org.apache.xpath.internal.SourceTree;

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
        String intArrStr = java.util.Arrays.toString(arr);
        System.out.println("min = " + min + "\nmax = " + max);
        System.out.println(intArrStr);

        System.out.println("\n////////////////////////////////////");


    }
}
