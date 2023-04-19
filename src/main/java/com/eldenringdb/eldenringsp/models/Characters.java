package com.eldenringdb.eldenringsp.models;

import javax.persistence.*;

@Entity
@Table(name = "Characters")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Affiliation")
    private String Affiliation;

    @Column(name = "Race")
    private String Race;

    @Column(name = "Role")
    private String Role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAffiliation() {
        return Affiliation;
    }

    public void setAffiliation(String affiliation) {
        Affiliation = affiliation;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    

}
