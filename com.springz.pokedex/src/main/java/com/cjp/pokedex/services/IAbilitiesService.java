package com.cjp.pokedex.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.pokedex.dtos.AbilitiesDto;

public interface IAbilitiesService {

	List<AbilitiesDto> findAllAbility();
	
	AbilitiesDto saveAbility (AbilitiesDto abilitiesDto)throws IllegalArgumentException, ParseException;
	
	AbilitiesDto updateAbility (AbilitiesDto abilitiesDto)throws IllegalArgumentException, ParseException;
	
	void deleteAbility (AbilitiesDto abilitiesDto)throws IllegalArgumentException, ParseException;
}
