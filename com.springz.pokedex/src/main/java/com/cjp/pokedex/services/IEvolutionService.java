package com.cjp.pokedex.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.pokedex.dtos.EvolutionDto;

public interface IEvolutionService {
	
	List<EvolutionDto> findAllEvolution();
	
	EvolutionDto saveEvolution (EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException;
	
	EvolutionDto updateEvolution (EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException;
	
	void deleteEvolution (EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException;

}
