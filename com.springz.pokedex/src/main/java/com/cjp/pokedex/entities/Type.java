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
@Table(name="type")
public class Type {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDtype")
	private Long IDtype;
	
	@Column(name="typename")
	private String typeName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="firstType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pokemon> pokemonsWithFirstType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="secondType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pokemon> pokemonsWithSecondType;

	public Long getIDtype() {
		return IDtype;
	}

	public void setIDtype(Long iDtype) {
		IDtype = iDtype;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Pokemon> getPokemonsWithFirstType() {
		return pokemonsWithFirstType;
	}

	public void setPokemonsWithFirstType(List<Pokemon> pokemonsWithFirstType) {
		this.pokemonsWithFirstType = pokemonsWithFirstType;
	}

	public List<Pokemon> getPokemonsWithSecondType() {
		return pokemonsWithSecondType;
	}

	public void setPokemonsWithSecondType(List<Pokemon> pokemonsWithSecondType) {
		this.pokemonsWithSecondType = pokemonsWithSecondType;
	}
	

}
