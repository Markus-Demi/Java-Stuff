package by.itacademy.task1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    private final static String LINK = "http://kiparo.ru/t/test.json";

    public static void main(String[] args) {
        try {
            Root root = new ObjectMapper().readValue(new URL(LINK), Root.class);
            System.out.println(root.toString());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
