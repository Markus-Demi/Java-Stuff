package by.m4rk.demi.Entity;

public class Articles extends Papers {
    private String articleName;
    private String author;
    private int id;

    public Articles(String articleName, String author, int id) {
        this.articleName = articleName;
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
        return articleName;
    }

    public void setName(String articleName) {
        this.articleName = articleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Articles\n" +
                "\tArticle: " + articleName +
                ", Article Author: " + author;
    }
}
