package com.example.slava;

import com.example.slava.academys.Academy;
import com.example.slava.concert.Concert;
import com.example.slava.io.InputValue;
import com.example.slava.people.Artist;
import com.example.slava.people.Human;

public class ProgramMain {
    public static void main(String[] args) {
        Human[] humans = new Human[5];

        InputValue inputValue;
        String name;
        int age;

        for (int i = 0; i < humans.length; i++) {
            inputValue = new InputValue();
            name = inputValue.getName();
            age = inputValue.getInt(name);
            humans[i] = new Human(name, age);
        }

        Academy academy = new Academy();
        Artist[] artists = academy.teach(humans);

        Concert concert = new Concert(artists);
        concert.presentArtists();
        concert.performShow();
    }
}
