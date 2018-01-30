package by.itacademy.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        String word = "";
        System.out.println("Enter a string, if you want to quit wright \"exit\"");
        while (!word.equals("exit")) {
            try {
                word = scanner.nextLine();
                list.add(word);
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
        list.remove(list.size() - 1);

        for (String s : list)
            System.out.print(s.replace("a", "") + " ");

        Set<String> set = new HashSet<>(list);
        for(String s: set)
            System.out.println(s);
    }
}
