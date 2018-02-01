package by.itacademy.task;

public class Main {
    public static void main(String[] args) {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();

        simpleThread1.setName("Thread One");
        simpleThread2.setName("Thread Two");

        System.out.println("Press it double (cos 2 thread objects wake up start() method):" +
                "\n1 - to show async threads." +
                "\n2 - to show sync threads." +
                "\nanything else to quit.");
        simpleThread1.start();
        simpleThread2.start();
    }

    public static void print10(int [] arr){
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
    }

    public static synchronized void printSynchronyzed10(int [] arr){
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
    }
}
