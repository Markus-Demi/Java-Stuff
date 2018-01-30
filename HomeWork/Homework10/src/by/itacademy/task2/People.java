package by.itacademy.task2;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printRandomPerson() {
        int peopleSize = people.size();
        int randomNum = (int) (Math.random() * peopleSize);
        System.out.println("Random person: " + people.get(randomNum).toString());
    }
}
