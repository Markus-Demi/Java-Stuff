package by.m4rk.demi.Entity;

public class Newspapers extends Papers {
    private String newspaperName;
    private int id;

    public Newspapers(String newspaperName, int id) {
        this.newspaperName = newspaperName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return newspaperName;
    }

    public void setName(String newspaperName) {
        this.newspaperName = newspaperName;
    }

    @Override
    public String toString() {
        return "Newspapers\n" +
                "\tNewspaper: " + newspaperName;
    }
}
