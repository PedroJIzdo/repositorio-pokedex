package com.cjp.pokedex.services.impl;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.pokedex.dtos.PokemonDto;
import com.cjp.pokedex.entities.Pokemon;
import com.cjp.pokedex.services.IPokemonService;
import com.cjp.pokedex.repository.PokemonRepository;
import com.cjp.pokedex.Mapper.PokemonMapper;

@Service
public class PokemonServiceImpl implements IPokemonService {

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Autowired
	private PokemonMapper pokemonMapper;
	
	@Override
	public List<PokemonDto> findAllPokemon() {
		// TODO Esbozo de método generado automáticamente
		return pokemonMapper.transformToDto(pokemonRepository.findAll());
	}

	@Override
	@Modifying
	public PokemonDto save(PokemonDto pokemonDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return pokemonMapper.transformToDto(pokemonRepository.save(pokemonMapper.transformToPojo(pokemonDto)));
	}

	@Override
	public PokemonDto update(PokemonDto pokemonDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return pokemonMapper.transformToDto(pokemonRepository.save(pokemonMapper.transformToPojo(pokemonDto)));
	}

	@Override
	public void deletePokemon(PokemonDto pokemonDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		pokemonRepository.delete(pokemonMapper.transformToPojo(pokemonDto));
	}

	@Override
	public PokemonDto findById(long id) {
		// TODO Esbozo de método generado automáticamente
		return pokemonMapper.transformToDto(pokemonRepository.findById(id));
	}









	

}
