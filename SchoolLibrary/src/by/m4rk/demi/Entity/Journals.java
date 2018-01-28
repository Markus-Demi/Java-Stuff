package by.m4rk.demi.Entity;

public class Journals extends Papers {
    private String journalName;
    private int id;

    public Journals(String journalName, int id) {
        this.journalName = journalName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return journalName;
    }

    public void setName(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public String toString() {
        return "Journals\n" +
                "\tJournal: " + journalName;
    }
}
