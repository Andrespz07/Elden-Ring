package com.eldenringdb.eldenringsp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findAll();

    com.eldenringdb.eldenringsp.models.Character save(com.eldenringdb.eldenringsp.models.Character dragonLansseax);
}


