package com.example.slava.people.instances;


import com.example.slava.interfaces.Skill;
import com.example.slava.people.Artist;
import com.example.slava.interfaces.Musician;

public class GuitarPlayer extends Artist implements Musician {

    public GuitarPlayer(int age, String name, String pseudonym) {
        super(age, name, pseudonym);
    }

    @Override
    public Skill getSkill() {
        return this;
    }

    @Override
    public String skillToString() {
        return "играет на гитаре";
    }
}
