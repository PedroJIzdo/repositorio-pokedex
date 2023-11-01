package com.cjp.pokedex.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.pokedex.Mapper.TypeMapper;
import com.cjp.pokedex.dtos.TypeDto;
import com.cjp.pokedex.repository.TypeRepository;
import com.cjp.pokedex.services.ITypeService;

@Service
public class TypeImpl implements ITypeService{

	@Autowired
	private TypeRepository typeRepository;
	
	@Autowired
	private TypeMapper typeMapper;
	
	@Override
	public List<TypeDto> findAllType() {
		// TODO Esbozo de método generado automáticamente
		return typeMapper.transformToDto(typeRepository.findAll());
	}

	@Override
	@Modifying
	public TypeDto saveType(TypeDto typeDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return typeMapper.transformToDto(typeRepository.save(typeMapper.transformToPojo(typeDto)));
	}

	@Override
	public TypeDto updateType(TypeDto typeDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return typeMapper.transformToDto(typeRepository.save(typeMapper.transformToPojo(typeDto)));
	}

	@Override
	public void deleteType(TypeDto typeDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		typeRepository.delete(typeMapper.transformToPojo(typeDto));
	}
	

}
