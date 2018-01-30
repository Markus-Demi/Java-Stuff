package by.itacademy.task1;

import java.util.Date;
import java.util.List;

public class Root {
    private String name;
    @JsonDeserialize(using = MyBoolean.class)
    private boolean gender;
    private Date date;
    private List<People> people;

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", date=" + date +
                ", people=" + people +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
