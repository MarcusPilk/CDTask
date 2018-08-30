package com.demo.app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class CD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cd_id;

    @Column(name = "cd_title")
    private String cd_title;

    @Column(name = "cd_artists")
    @OneToMany
    private List<Artist> cd_artists;

    public CD() {
    }

    public CD(String cd_title) {
        this.cd_title = cd_title;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public String getCd_title() {
        return cd_title;
    }

    public void setCd_title(String cd_title) {
        this.cd_title = cd_title;
    }
}
