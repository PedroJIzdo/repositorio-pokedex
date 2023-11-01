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
@Table(name="egggroup")
public class egggroup {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDegg")
	private Long id_egg;

	@Column(name="eggname")
	private String eggName;
	
	@OneToMany (fetch = FetchType.LAZY,orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "firstEggGroup")
	private List<Pokemon> pokemonWithFirstEgg;
	
	@OneToMany (fetch = FetchType.LAZY,orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "secondEggGroup")
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
