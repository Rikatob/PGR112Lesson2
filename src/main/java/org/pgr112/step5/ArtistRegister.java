package org.pgr112.step5;

import java.util.ArrayList;

public class ArtistRegister {
    ArrayList<Artist> artistRegister = new ArrayList<>();

    public void addArtist(Artist artist){
        artistRegister.add(artist);
    }

    public void checkRegister(){
        for(Artist artist : artistRegister){
            artist.printFieldValues();
        }
    }
}
