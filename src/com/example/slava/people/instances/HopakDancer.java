package com.example.slava.people.instances;

import com.example.slava.interfaces.Skill;
import com.example.slava.people.Artist;
import com.example.slava.interfaces.Dancer;

public class HopakDancer extends Artist implements Dancer {
    public HopakDancer(int age, String name, String pseudonym) {
        super(age, name, pseudonym);
    }

    @Override
    public String skillToString() {
        return "танцует \"Гопак\"";
    }

    @Override
    public Skill getSkill() {
        return this;
    }
}
