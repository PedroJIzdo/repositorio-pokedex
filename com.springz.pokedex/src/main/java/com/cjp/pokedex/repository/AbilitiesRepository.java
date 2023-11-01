package com.cjp.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.pokedex.entities.Abilities;

public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {

}
