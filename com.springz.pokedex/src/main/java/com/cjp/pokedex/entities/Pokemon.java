package com.cjp.pokedex.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pokemon")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="IDpoke")
	private Long id_pokemon;

	@Column(name="pokename")
	private String name;
	
	@Column(name="hp")
	private Long hp;
	
	@Column(name="dualtype")
	private Boolean dualtype;
	
	@Column(name = "attack")
	private Long attack;
	
	@Column(name = "defense")
	private Long defense;
	
	@Column (name = "spattack")
	private Long spattack;
	
	@Column (name = "spdefense")
	private Long spdefense;
	
	@Column (name = "speed")
	private Long speed;
	
	@Column (name="description")
	private String description;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name="firstEggGroup", referencedColumnName ="IDegg")
	private egggroup firstEggGroup;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn (name="secondEggGroup", referencedColumnName ="IDegg")
	private egggroup secondEggGroup;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "firstType", referencedColumnName = "IDType")
    private Type firstType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "secondType", referencedColumnName = "IDType")
    private Type secondType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ability", referencedColumnName = "IDability")
    private Abilities ability;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hiddenAbility", referencedColumnName = "IDability")
    private Abilities hiddenAbility;
    
	
	public Abilities getAbility() {
		return ability;
	}


	public void setAbility(Abilities ability) {
		ability = ability;
	}


	public Abilities getHiddenAbility() {
		return hiddenAbility;
	}


	public void setHiddenAbility(Abilities hiddenAbility) {
		this.hiddenAbility = hiddenAbility;
	}


	public Type getFirstType() {
		return firstType;
	}


	public void setFirstType(Type firstType) {
		this.firstType = firstType;
	}


	public Type getSecondType() {
		return secondType;
	}


	public void setSecondType(Type secondType) {
		this.secondType = secondType;
	}


	public String getDescription() {
		return description;
	}


	public egggroup getFirstEgg() {
		return firstEggGroup;
	}


	public void setFirstEgg(egggroup firstEgg) {
		this.firstEggGroup = firstEgg;
	}


	public egggroup getSecondEgg() {
		return secondEggGroup;
	}


	public void setSecondEgg(egggroup secondEgg) {
		this.secondEggGroup = secondEgg;
	}


	public void setDescription(String description) {
		this.description = description;
	}


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

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}
	
	
}
