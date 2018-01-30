package by.itacademy.task1;

import java.util.ArrayList;
import java.util.List;

public class Root {

    private String name;
    private List<People> people = new ArrayList<>();

    public void addPeople(People people) {
        this.people.add(people);
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
}
