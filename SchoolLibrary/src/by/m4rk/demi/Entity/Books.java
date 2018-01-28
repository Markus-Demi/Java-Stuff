package by.m4rk.demi.Entity;

public class Books extends Papers {
    private String bookTitle;
    private String author;
    private int id;

    public Books(String bookTitle, String author, int id) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return bookTitle;
    }

    public void setName(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books\n" +
                "\tBook Title: " + bookTitle +
                ", Author: " + author;
    }
}
