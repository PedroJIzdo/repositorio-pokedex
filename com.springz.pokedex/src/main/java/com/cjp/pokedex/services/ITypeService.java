package com.cjp.pokedex.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.pokedex.dtos.TypeDto;


public interface ITypeService {
	
	List<TypeDto> findAllType();
	
	TypeDto saveType (TypeDto typeDto) throws IllegalArgumentException, ParseException;
	
	TypeDto updateType (TypeDto typeDto)throws IllegalArgumentException, ParseException;
	
	void deleteType (TypeDto typeDto)throws IllegalArgumentException, ParseException;
	
}
