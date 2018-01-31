package by.itacademy.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "E:\\Media\\Music";
        Manager manager = new Manager(path);

        manager.parseMp3();

        String duplicatesByName = "Dupes by name:" + "\n" + manager.getDuplicates((HashMap<String, ArrayList<String>>) manager.repeatsByName);
        System.out.println(duplicatesByName);

        String duplicatesBySum = "Dupes by checksum:" + "\n" + manager.getDuplicates((HashMap<String, ArrayList<String>>) manager.repeatsByCheckSum);
        System.out.println(duplicatesBySum);
    }
}
