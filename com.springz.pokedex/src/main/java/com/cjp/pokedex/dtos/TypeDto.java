package com.cjp.pokedex.dtos;

import java.util.List;

import com.cjp.pokedex.entities.Pokemon;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TypeDto {

		private Long IDtype;
		
		private String typeName;
		
		@JsonIgnore
		private List<Pokemon> pokemonWithFirstType;
		
		@JsonIgnore
		private List<Pokemon> pokemonWithSecondType;

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

		public List<Pokemon> getPokemonWithFirstType() {
			return pokemonWithFirstType;
		}

		public void setPokemonWithFirstType(List<Pokemon> pokemonWithFirstType) {
			this.pokemonWithFirstType = pokemonWithFirstType;
		}

		public List<Pokemon> getPokemonWithSecondType() {
			return pokemonWithSecondType;
		}

		public void setPokemonWithSecondType(List<Pokemon> pokemonWithSecondType) {
			this.pokemonWithSecondType = pokemonWithSecondType;
		}
}
