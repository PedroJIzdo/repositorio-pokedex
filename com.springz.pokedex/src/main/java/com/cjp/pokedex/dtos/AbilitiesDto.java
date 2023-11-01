package com.cjp.pokedex.dtos;

import java.util.List;

import com.cjp.pokedex.entities.Pokemon;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AbilitiesDto {

	private Long IDability;
	
	private String abilityName;
	
	@JsonIgnore
	private List<Pokemon> pokemonWithAbility;
	
	@JsonIgnore
	private List<Pokemon> pokemonWithHiddenAbility;

	public Long getIDability() {
		return IDability;
	}

	public void setIDability(Long iDability) {
		IDability = iDability;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public List<Pokemon> getPokemonWithAbility() {
		return pokemonWithAbility;
	}

	public void setPokemonWithAbility(List<Pokemon> pokemonWithAbility) {
		this.pokemonWithAbility = pokemonWithAbility;
	}

	public List<Pokemon> getPokemonWithHiddenAbility() {
		return pokemonWithHiddenAbility;
	}

	public void setPokemonWithHiddenAbility(List<Pokemon> pokemonWithHiddenAbility) {
		this.pokemonWithHiddenAbility = pokemonWithHiddenAbility;
	}
	
	
}
