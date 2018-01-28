package by.m4rk.demi.Entity;

import java.util.Date;
import java.util.Map;

public class Pupils {
    private String name;
    private int bookCount;
    private Date birthday;

    public Pupils(String name, int bookCount, Date birthday) {
        this.name = name;
        this.bookCount = bookCount;
        this.birthday = birthday;
    }

    // id of books, articles, etc
    private Map<Integer, Integer> storageIdInformation;

    public Map<Integer, Integer> getStorageIdInformation() {
        return storageIdInformation;
    }

    public void setStorageIdInformation(int idInformation) {
        if (storageIdInformation.containsKey(idInformation)) {
            storageIdInformation.put(idInformation, storageIdInformation.get(idInformation) + 1);
        } else {
            storageIdInformation.put(idInformation, 1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
