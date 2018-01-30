package by.itacademy.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private final static String key1 = "man";
    private final static String key2 = "woman";
    public static void main(String[] args) {
        People women = new People();
        women.addPerson(new Person("Kate", "Blansch"));
        women.addPerson(new Person("Elen", "Ripple"));
        women.addPerson(new Person("Jane", "Abrams"));
        People men = new People();
        men.addPerson(new Person("Josh", "Tramp"));
        men.addPerson(new Person("Axel", "Low"));
        men.addPerson(new Person("Mad", "Mickelson"));
        Map<String, People> peopleMap = new HashMap<>();
        peopleMap.put(key1, men);
        peopleMap.put(key2, women);
        System.out.println("man or woman:");
        Scanner inputScanner = new Scanner(System.in);
        String keyPerson = inputScanner.next();
        peopleMap.get(keyPerson).printRandomPerson();
    }
}
