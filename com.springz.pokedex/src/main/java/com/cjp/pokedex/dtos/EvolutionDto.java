package com.cjp.pokedex.dtos;



import com.cjp.pokedex.entities.Pokemon;

public class EvolutionDto {

	private Long IDEvolution;
	
	private Pokemon originalPokemon;
	
	private Pokemon evolvedPokemon;

	public Long getIDEvolution() {
		return IDEvolution;
	}

	public void setIDEvolution(Long iDEvolution) {
		IDEvolution = iDEvolution;
	}

	public Pokemon getOriginalPokemon() {
		return originalPokemon;
	}

	public void setOriginalPokemon(Pokemon originalPokemon) {
		this.originalPokemon = originalPokemon;
	}

	public Pokemon getEvolvedPokemon() {
		return evolvedPokemon;
	}

	public void setEvolvedPokemon(Pokemon evolvedPokemon) {
		this.evolvedPokemon = evolvedPokemon;
	}
}
