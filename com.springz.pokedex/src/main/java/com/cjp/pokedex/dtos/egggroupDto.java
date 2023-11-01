package com.cjp.pokedex.dtos;

import java.util.List;

import com.cjp.pokedex.entities.Pokemon;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class egggroupDto {

	private Long id_egg;
	
	private String eggName;
	
	@JsonIgnore
	private List<Pokemon> pokemonWithFirstEgg;
	
	@JsonIgnore
	private List<Pokemon> pokemonWithSecondEgg;
	

	public List<Pokemon> getPokemonWithFirstEgg() {
		return pokemonWithFirstEgg;
	}

	public void setPokemonWithFirstEgg(List<Pokemon> pokemonWithFirstEgg) {
		this.pokemonWithFirstEgg = pokemonWithFirstEgg;
	}

	public List<Pokemon> getPokemonWithSecondEgg() {
		return pokemonWithSecondEgg;
	}

	public void setPokemonWithSecondEgg(List<Pokemon> pokemonWithSecondEgg) {
		this.pokemonWithSecondEgg = pokemonWithSecondEgg;
	}

	public Long getId_egg() {
		return id_egg;
	}

	public void setId_egg(Long id_egg) {
		this.id_egg = id_egg;
	}

	public String getEggName() {
		return eggName;
	}

	public void setEggName(String eggName) {
		this.eggName = eggName;
	}
}
