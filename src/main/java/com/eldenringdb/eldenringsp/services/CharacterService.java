package com.eldenringdb.eldenringsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eldenringdb.eldenringsp.models.Character;
import com.eldenringdb.eldenringsp.repositories.CharacterRepository;

@Service
public class CharacterService {
    @Autowired 
    private CharacterRepository characterRepository;

    public void save(Character character) {
        characterRepository.save(character);
    }
    public List<Character> listAll(){
        return characterRepository.findAll();
    }
}
