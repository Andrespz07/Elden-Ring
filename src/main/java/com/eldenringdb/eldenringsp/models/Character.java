package com.eldenringdb.eldenringsp.models;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @Column(name = "id_character")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "affiliation")
    private String affiliation;

    @Column(name = "race")
    private String race;

    @Column(name = "role")
    private String role;
    
    
}
