package com.cjp.pokedex.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.pokedex.Mapper.AbilitiesMapper;
import com.cjp.pokedex.dtos.AbilitiesDto;
import com.cjp.pokedex.repository.AbilitiesRepository;
import com.cjp.pokedex.services.IAbilitiesService;


@Service
public class AbilitiesImpl implements IAbilitiesService{

	@Autowired
	private AbilitiesRepository abilitiesRepository;
	
	@Autowired
	private AbilitiesMapper abilitiesMapper;
	
	@Override
	public List<AbilitiesDto> findAllAbility() {
		// TODO Esbozo de método generado automáticamente
		return abilitiesMapper.transformToDto(abilitiesRepository.findAll());
	}

	@Override
	@Modifying
	public AbilitiesDto saveAbility(AbilitiesDto abilitiesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return abilitiesMapper.transformToDto(abilitiesRepository.save(abilitiesMapper.transformToPojo(abilitiesDto)));
	}

	@Override
	public AbilitiesDto updateAbility(AbilitiesDto abilitiesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return abilitiesMapper.transformToDto(abilitiesRepository.save(abilitiesMapper.transformToPojo(abilitiesDto)));
	}

	@Override
	public void deleteAbility(AbilitiesDto abilitiesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		abilitiesRepository.delete(abilitiesMapper.transformToPojo(abilitiesDto));
	}

}
