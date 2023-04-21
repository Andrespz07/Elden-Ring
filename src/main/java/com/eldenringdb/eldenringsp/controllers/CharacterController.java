package com.eldenringdb.eldenringsp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eldenringdb.eldenringsp.models.Character;
import com.eldenringdb.eldenringsp.services.CharacterService;

@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("")
public List<Character> getAllCharacters() {
    return characterService.listAll();
}

    @PostMapping("/add")
    public void addCharacter(@RequestBody Character character) {
       characterService.save(character);
    }

    
}

