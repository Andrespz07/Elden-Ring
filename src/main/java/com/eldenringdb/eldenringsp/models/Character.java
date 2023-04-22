package com.eldenringdb.eldenringsp.models;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @Column(name = "id_character")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

   
    private String affiliation;


    private String race;


    private String role;

    private String url_image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }


    
    
}

