package com.cjp.pokedex.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PokemonDto {
	
	
	private Long id_pokemon;

	
	private String name;
	
	
	private Long hp;
	

	private Boolean dualtype;
	

	private Long attack;
	

	private Long defense;
	

	private Long spattack;
	

	private Long spdefense;
	
	private String description;
	
	@JsonIgnore
	private egggroupDto firstEgg;
	
	@JsonIgnore
	private egggroupDto secondEgg;
	
	@JsonIgnore
	private TypeDto firstType;
	
	@JsonIgnore
	private TypeDto secondType;
	
	@JsonIgnore
	private AbilitiesDto ability;
	
	@JsonIgnore
	private AbilitiesDto hiddenAbility;
	
	private Long speed;

	public Long getId_pokemon() {
		return id_pokemon;
	}

	public void setId_pokemon(Long id_pokemon) {
		this.id_pokemon = id_pokemon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHp() {
		return hp;
	}

	public void setHp(Long hp) {
		this.hp = hp;
	}

	public Boolean getDualtype() {
		return dualtype;
	}

	public void setDualtype(Boolean dualtype) {
		this.dualtype = dualtype;
	}

	public Long getAttack() {
		return attack;
	}

	public void setAttack(Long attack) {
		this.attack = attack;
	}

	public Long getDefense() {
		return defense;
	}

	public void setDefense(Long defense) {
		this.defense = defense;
	}

	public Long getSpattack() {
		return spattack;
	}

	public void setSpattack(Long spattack) {
		this.spattack = spattack;
	}

	public Long getSpdefense() {
		return spdefense;
	}

	public void setSpdefense(Long spdefense) {
		this.spdefense = spdefense;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public egggroupDto getFirstEgg() {
		return firstEgg;
	}

	public void setFirstEgg(egggroupDto firstEgg) {
		this.firstEgg = firstEgg;
	}

	public egggroupDto getSecondEgg() {
		return secondEgg;
	}

	public void setSecondEgg(egggroupDto secondEgg) {
		this.secondEgg = secondEgg;
	}

	public TypeDto getFirstType() {
		return firstType;
	}

	public void setFirstType(TypeDto firstType) {
		this.firstType = firstType;
	}

	public TypeDto getSecondType() {
		return secondType;
	}

	public void setSecondType(TypeDto secondType) {
		this.secondType = secondType;
	}

	public AbilitiesDto getAbility() {
		return ability;
	}

	public void setAbility(AbilitiesDto ability) {
		this.ability = ability;
	}

	public AbilitiesDto getHiddenAbility() {
		return hiddenAbility;
	}

	public void setHiddenAbility(AbilitiesDto hiddenAbility) {
		this.hiddenAbility = hiddenAbility;
	}

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}
	
	
	

}
