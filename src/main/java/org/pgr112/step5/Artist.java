package org.pgr112.step5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist {
    private String artistName;
    private LocalDate dateOfBirth;
    private String city;
    private String country;
    private ArrayList artistArray;

    public Artist(String artistName,LocalDate dateOfBirth, String city, String country){
        this.artistName = artistName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }

    //Getter
    public String getArtistName(){
        return artistName;
    }
    //Setter
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    //Getter
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    //Setter
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    //Getter
    public String getCity() {
        return city;
    }
    //Setter
    public void setCity(String city) {
        this.city = city;
    }
    //Getter
    public String getCountry() {
        return country;
    }
    //Setter
    public void setCountry(String country) {
        this.country = country;
    }

    public void printFieldValues(){
        System.out.println("Artist name:   " + artistName);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("City:          " + city);
        System.out.println("Country:       " + country);

    }
}
