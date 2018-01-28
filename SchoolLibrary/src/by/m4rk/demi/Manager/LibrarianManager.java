package by.m4rk.demi.Manager;

import by.m4rk.demi.Entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarianManager {
    private List<Information> informationList = new ArrayList<>();

    private Information information = new Information();
    private Books books = new Books("Blood & wine", "A. Gregory-McGoy", 1);
    private Articles articles = new Articles("What do cats do when they alone?", "K. Hopes", 2);
    private Journals journals = new Journals("Maxim", 3);
    private Newspapers newspapers = new Newspapers("Sun, the", 4);

    //private Pupils pupils = new Pupils("John", 0, "11/12/1994");

    private void fillInformation() {
        information.addBookToList(books);
        information.addArticleToList(articles);
        information.addJournalToList(journals);
        information.addNewspaperToList(newspapers);
        informationList.add(information);

    }
    private void showAvailableBooks() {
        fillInformation();
        System.out.println("Available paperworks:");
        for(Information info : informationList) {
            System.out.println(info.getBooksList());
            System.out.println(info.getArticlesList());
            System.out.println(info.getJournalsList());
            System.out.println(info.getNewspapersList());
        }
        /*for(int i = 0; i < booksList.size(); i++) {
            Books books = booksList.get(i);
            books.toString();
        }*/
    }

    private void printReportMoreThan1Book() {
        System.out.println("report1");
    }

    private void printReportEquals2Book() {
        System.out.println("report2");
    }

    public void libMenu() {
        System.out.println("\nEnter a num to choose between:" +
                "\n1. Show all available books." +
                "\n2. Show all pupils who have read more than 1 book." +
                "\n3. Show all pupils who have read less than or equals 2 books." +
                "\n4. Sort (?)" +
                "\nEnter anything else to exit.\n");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int menuChoice = Integer.parseInt(scanner.nextLine());
                switch (menuChoice) {
                    case 1: {
                        showAvailableBooks();
                        break;
                    }
                    case 2: {
                        // methods that print pup with a num of books that he read
                        printReportMoreThan1Book();
                        break;
                    }
                    case 3: {
                        // similar to case 2 but where pup read less than or equals 2 books
                        printReportEquals2Book();
                        break;
                    }
                    case 4: {
                        // sort method
                        break;
                    }
                    default: {
                        return;
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
