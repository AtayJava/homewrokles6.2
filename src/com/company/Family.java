package com.company;

public class Family < T extends Number>  implements Countable {

    private T people;

    public T getPeople() {
        return people;
    }

    public void setPeople(T people) {
        this.people = people;
    }

    @Override
    public Object getId() {
        return null;
    }
}
