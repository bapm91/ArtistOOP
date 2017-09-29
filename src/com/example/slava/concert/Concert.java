package com.example.slava.concert;


import com.example.slava.people.Artist;

public class Concert {
    private static final String PRESENT = "Name is %s, %d age ald and %s nick's\n";
    private static final String PERFORM = "%s %s\n";
    private Artist[] artists;

    public Concert(Artist[] artists){
        this.artists = artists;
    }

    public void presentArtists(){
        for (Artist artist : artists) {
            System.out.printf(PRESENT, artist.getName(), artist.getAge(), artist.getPseudonym());
        }
    }

    public void performShow(){
        for (Artist artist : artists) {
            System.out.printf(PERFORM, artist.getName(), artist.getSkill().skillToString());
        }
    }
}
