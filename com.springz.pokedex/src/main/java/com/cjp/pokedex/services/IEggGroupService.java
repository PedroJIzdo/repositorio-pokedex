package com.cjp.pokedex.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.pokedex.dtos.egggroupDto;

public interface IEggGroupService {
	
	List<egggroupDto> findAllEggGroup();
	
	egggroupDto save (egggroupDto egggroupDto)throws IllegalArgumentException, ParseException;
	
	egggroupDto update (egggroupDto egggroupDto) throws IllegalArgumentException, ParseException;
	
	void deleteEggGroup (egggroupDto egggroupDto) throws IllegalArgumentException, ParseException;
	
}
