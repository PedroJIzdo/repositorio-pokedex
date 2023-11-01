package com.cjp.pokedex.services;

import java.text.ParseException;
import java.util.List;


import com.cjp.pokedex.dtos.PokemonDto;



public interface IPokemonService {
	
	List<PokemonDto> findAllPokemon ();
	
	PokemonDto findById(long id);
	
	PokemonDto save (PokemonDto pokemonDto) throws IllegalArgumentException, ParseException;
	
	PokemonDto update (PokemonDto pokemonDto) throws IllegalArgumentException, ParseException;
	
	void deletePokemon (PokemonDto pokemonDto) throws IllegalArgumentException, ParseException;
}
