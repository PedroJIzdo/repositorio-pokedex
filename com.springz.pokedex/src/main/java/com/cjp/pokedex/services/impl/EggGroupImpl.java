package com.cjp.pokedex.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.pokedex.Mapper.EggGroupMapper;
import com.cjp.pokedex.dtos.egggroupDto;
import com.cjp.pokedex.repository.EggGroupRepository;
import com.cjp.pokedex.services.IEggGroupService;

@Service
public class EggGroupImpl implements IEggGroupService{

	@Autowired
	private EggGroupRepository egggroupRepository;
	
	@Autowired
	private EggGroupMapper egggroupMapper;
	
	@Override
	public List<egggroupDto> findAllEggGroup() {
		// TODO Esbozo de método generado automáticamente
		return egggroupMapper.transformToDto(egggroupRepository.findAll());
	}

	@Override
	@Modifying
	public egggroupDto save(egggroupDto egggroupDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return egggroupMapper.transformToDto(egggroupRepository.save(egggroupMapper.transformToPojo(egggroupDto)));
	}

	@Override
	public egggroupDto update(egggroupDto egggroupDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return egggroupMapper.transformToDto(egggroupRepository.save(egggroupMapper.transformToPojo(egggroupDto)));
	}

	@Override
	public void deleteEggGroup(egggroupDto egggroupDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		egggroupRepository.delete(egggroupMapper.transformToPojo(egggroupDto));
	}
	
	

}
