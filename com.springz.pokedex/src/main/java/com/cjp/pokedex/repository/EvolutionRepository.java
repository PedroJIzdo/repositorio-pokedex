package com.cjp.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.pokedex.entities.Evolution;

public interface EvolutionRepository extends JpaRepository<Evolution, Long> {

}
