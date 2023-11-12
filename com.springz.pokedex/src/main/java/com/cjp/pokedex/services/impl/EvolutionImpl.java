package com.cjp.pokedex.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjp.pokedex.Mapper.EvolutionMapper;
import com.cjp.pokedex.dtos.EvolutionDto;
import com.cjp.pokedex.repository.EvolutionRepository;
import com.cjp.pokedex.services.IEvolutionService;

@Service
public class EvolutionImpl implements IEvolutionService {

	@Autowired
	private EvolutionRepository evolutionRepository;
	
	@Autowired
	private EvolutionMapper evolutionMapper;
	
	@Override
	public List<EvolutionDto> findAllEvolution() {
		// TODO Esbozo de método generado automáticamente
		return evolutionMapper.transformToDto(evolutionRepository.findAll());
	}

	@Override
	public EvolutionDto saveEvolution(EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return evolutionMapper.transformToDto(evolutionRepository.save(evolutionMapper.transformToPojo(evolutionDto)));
	}

	@Override
	public EvolutionDto updateEvolution(EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return evolutionMapper.transformToDto(evolutionRepository.save(evolutionMapper.transformToPojo(evolutionDto)));
	}

	@Override
	public void deleteEvolution(EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		evolutionRepository.delete(evolutionMapper.transformToPojo(evolutionDto));
	}

}
