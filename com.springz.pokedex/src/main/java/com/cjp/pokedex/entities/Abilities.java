package com.cjp.pokedex.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="abilities")
public class Abilities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDability")
	private Long IDability;
	
	@Column(name="abilityname")
	private String abilityName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="ability", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Pokemon> pokemonWithAbility;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="hiddenAbility", cascade = CascadeType.ALL, orphanRemoval = true)
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
