package by.m4rk.demi.Entity;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private List<Books> booksList = new ArrayList<>();
    private List<Articles> articlesList = new ArrayList<>();
    private List<Journals> journalsList = new ArrayList<>();
    private List<Newspapers> newspapersList = new ArrayList<>();
/*
    private Books books = new Books("Blood & wine", "A. Gregory-McGoy", 1);
    private Articles articles = new Articles("What do cats do when they alone?", "K. Hopes", 2);
    private Journals journals = new Journals("Maxim", 3);
    private Newspapers newspapers = new Newspapers("Sun, the", 4);
*/
    public void addBookToList(Books books) {
        booksList.add(books);
    }

    public void addArticleToList(Articles articles) {
        articlesList.add(articles);
    }

    public void addJournalToList(Journals journals) {
        journalsList.add(journals);
    }

    public void addNewspaperToList(Newspapers newspapers) {
        newspapersList.add(newspapers);
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public List<Articles> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<Articles> articlesList) {
        this.articlesList = articlesList;
    }

    public List<Journals> getJournalsList() {
        return journalsList;
    }

    public void setJournalsList(List<Journals> journalsList) {
        this.journalsList = journalsList;
    }

    public List<Newspapers> getNewspapersList() {
        return newspapersList;
    }

    public void setNewspapersList(List<Newspapers> newspapersList) {
        this.newspapersList = newspapersList;
    }
}
