package by.itacademy.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileReader reader = new FileReader("E:\\IOTest\\Test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println("Write something to pull it in txt file:");
        try (FileWriter writer = new FileWriter("E:\\IOTest\\Test.txt", true)) {
            String text = scanner.nextLine();
            writer.write(text);
            writer.append('\n');

            writer.flush();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
