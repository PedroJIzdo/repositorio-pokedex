package com.cjp.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cjp.pokedex.entities.Pokemon;

public interface  PokemonRepository extends JpaRepository<Pokemon,Long> {
	
	Pokemon findById (@Param("id") long id);
}
