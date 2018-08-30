package com.demo.app.domain;

import javax.persistence.*;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artist_id;

    @Column(name = "artist_name")
    private String artist_name;

    public Artist() {
    }

    public Artist(String artist_name) {
        this.artist_name = artist_name;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }
}
