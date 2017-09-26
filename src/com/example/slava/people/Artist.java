package com.example.slava.people;

import com.example.slava.interfaces.Skill;

public abstract class Artist extends Human {

    private String pseudonym;

    public Artist(int age, String name, String pseudonym) {
        super(name, age);
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        String age;
        if ((this.getAge() > 5 && this.getAge() < 20) ||
                this.getAge() % 10 > 5 ||
                this.getAge() % 10 == 0) {
            age = "лет";
        } else if (this.getAge() % 10 == 1) {
            age = "год";
        } else {
            age = "года";
        }
        return "Artist{" +
                "\n\tName " + getName() +
                "\n\tAge " + getAge() + " " + age +
                "\n\tpseudonym '" + pseudonym +
                "\n}";
    }

    public abstract Skill getSkill();

    public String getPseudonym() {
        return pseudonym;
    }
}
