package com.cjp.pokedex.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;

import com.cjp.pokedex.dtos.EvolutionDto;
import com.cjp.pokedex.entities.Evolution;

public class EvolutionMapper implements ModelMapper<Evolution, EvolutionDto>{

	@Override
	public EvolutionDto transformToDto(Evolution entity) {
		// TODO Esbozo de método generado automáticamente
		EvolutionDto dto = new EvolutionDto();
		if (dto != null) {
			dto.setIDEvolution(entity.getId());
			dto.setEvolvedPokemon(entity.getEvolvedPokemon());
			dto.setOriginalPokemon(entity.getOriginalPokemon());
		}
		return dto;
	}

	@Override
	public Evolution transformToPojo(EvolutionDto dto) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		Evolution entity = new Evolution ();
		if(entity != null) {
			entity.setId(dto.getIDEvolution());
			entity.setEvolvedPokemon(dto.getEvolvedPokemon());
			entity.setOriginalPokemon(dto.getOriginalPokemon());
		}
		return null;
	}

	@Override
	public List<EvolutionDto> transformToDto(List<Evolution> entities) {
		// TODO Esbozo de método generado automáticamente
		List<EvolutionDto> listaDto = new ArrayList();
		if(entities != null && !entities.isEmpty()) {
			for (Evolution entity : entities) {
				listaDto.add(transformToDto (entity));
			}
		}
		return listaDto;
	}

	@Override
	public List<Evolution> transformToPojo(List<EvolutionDto> dtos) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		List <Evolution> listaPojo = new ArrayList();
		if (dtos != null && !dtos.isEmpty()) {
			for(EvolutionDto dto : dtos) {
				listaPojo.add (transformToPojo (dto));
			}
		}
		return listaPojo;
	}

	@Override
	public Set<EvolutionDto> transformSetToDto(Set<Evolution> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Evolution> transformSetToPojo(Set<EvolutionDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<EvolutionDto> transformToDto(Page<Evolution> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Evolution> transformToPojo(Page<EvolutionDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

}
