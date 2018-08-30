package com.demo.app.domain;

import javax.persistence.*;

@Entity
public class Appears {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name = "cd_id")
    private int cd_id;

    @Column(name = "artist_id")
    private int artist_id;

    public Appears() {
    }

    public Appears(int cd_id, int artist_id) {
        this.cd_id = cd_id;
        this.artist_id = artist_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
}
