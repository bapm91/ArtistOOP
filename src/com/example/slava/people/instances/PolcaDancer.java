package com.example.slava.people.instances;


import com.example.slava.interfaces.Skill;
import com.example.slava.people.Artist;
import com.example.slava.interfaces.Dancer;

public class PolcaDancer extends Artist implements Dancer {

    public PolcaDancer(int age, String name, String pseudonym) {
        super(age, name, pseudonym);
    }

    @Override
    public String skillToString() {
        return "танцует \"Польку\"";
    }

    @Override
    public Skill getSkill() {
        return this;
    }
}