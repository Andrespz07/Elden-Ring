package com.eldenringdb.eldenringsp.controllers;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eldenringdb.eldenringsp.models.Character;
import com.eldenringdb.eldenringsp.repositories.CharacterRepository;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
public List<Character> getAllCharacters() {
    return characterRepository.findAll();
}

    

    @GetMapping("/{id}")
    public ResponseEntity<java.lang.Character> getCharacterById(@PathVariable Long id) {
        Optional<java.lang.Character> character = characterRepository.findById(id);

        if (character.isPresent()) {
            return ResponseEntity.ok(character.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public Character addCharacter(@RequestParam String name, @RequestParam String affiliation, @RequestParam String race, @RequestParam String role) {
        Character character = new Character();
        character.setName(name);
        character.setAffiliation(affiliation);
        character.setRace(race);
        character.setRole(role);

        return characterRepository.save(character);
    }

    @PostConstruct
    public void init() {
        addCharacter("Ancient Dragon Lansseax", "Dragons", "Dragon", "Boss");
        addCharacter("Blaidd the Half-Wolf", "Two Fingers", "Shadowbound Beast", "Warrior");
        addCharacter("Demi-Human Boc", "Unknown", "Demi-human", "NPC");
        addCharacter("Brother Corhyn", "Golden Order", "Human", "NPC");
    }
}

