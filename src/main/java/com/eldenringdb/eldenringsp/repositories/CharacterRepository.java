package com.eldenringdb.eldenringsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eldenringdb.eldenringsp.models.Character;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    

}


