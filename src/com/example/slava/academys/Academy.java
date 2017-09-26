package com.example.slava.academys;

import com.example.slava.io.InputValue;
import com.example.slava.people.Artist;
import com.example.slava.people.Human;
import com.example.slava.people.instances.*;

import java.util.Random;

public class Academy {

    public Artist teach(Human human) {
        return upgrade(human, new InputValue().getPseudonym());
    }

    public Artist[] teach(Human[] humans) {
        Artist[] artists = new Artist[humans.length];

        for (int i = 0; i < artists.length; i++) {
            artists[i] = teach(humans[i]);
        }
        return artists;
    }

    public Artist upgrade(Human human, String pseudonym){
        int skillIndex = new Random().nextInt(6);

        switch (skillIndex){

            case 1:
                return new HopakDancer(human.getAge(), human.getName(), pseudonym);

            case 2:
                return new PolcaDancer(human.getAge(), human.getName(), pseudonym);

            case 3:
                return new FolkSinger(human.getAge(), human.getName(), pseudonym);

            case 4:
                return new GuitarPlayer(human.getAge(), human.getName(), pseudonym);

            case 5:
                return new OperaSinger(human.getAge(), human.getName(), pseudonym);

            default:
                return new Pianist(human.getAge(), human.getName(), pseudonym);
        }
    }
}
