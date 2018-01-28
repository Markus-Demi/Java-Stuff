package by.m4rk.demi;

import by.m4rk.demi.Manager.LibrarianManager;

public class Main {
    public static void main(String[] args) {
        LibrarianManager librarianManager = new LibrarianManager();
        System.out.print("\tWelcome to the school library!\t");
        librarianManager.libMenu();
    }
}