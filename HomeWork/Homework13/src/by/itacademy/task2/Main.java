package by.itacademy.task2;

public class Main {
    public static void main(String[] args) {
        String fileName = "lolKekCheburek.exe";
        System.out.println(findExtension(fileName));
    }

    public static String findExtension(String fileName) {
        return fileName.replaceAll(".+\\.", "");
    }
}
