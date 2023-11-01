package com.cjp.pokedex.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.pokedex.dtos.AbilitiesDto;
import com.cjp.pokedex.entities.Abilities;

@Component
public class AbilitiesMapper implements ModelMapper<Abilities, AbilitiesDto>{

	@Override
	public AbilitiesDto transformToDto(Abilities entity) {
		// TODO Esbozo de método generado automáticamente
		AbilitiesDto dto = new AbilitiesDto();
		if(dto != null) {
			dto.setAbilityName(entity.getAbilityName());
			dto.setIDability(entity.getIDability());
		}
		return dto;
	}

	@Override
	public Abilities transformToPojo(AbilitiesDto dto) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		Abilities entity = new Abilities();
		if(entity != null) {
			entity.setIDability(dto.getIDability());
			entity.setAbilityName(dto.getAbilityName());
		}
		return entity;
	}

	@Override
	public List<AbilitiesDto> transformToDto(List<Abilities> entities) {
		// TODO Esbozo de método generado automáticamente
		List<AbilitiesDto> listaDto = new ArrayList();
		if(entities !=null && !entities.isEmpty()) {
			for(Abilities entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}
		return listaDto;
	}

	@Override
	public List<Abilities> transformToPojo(List<AbilitiesDto> dtos) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		List<Abilities> listaPojo = new ArrayList();
		if (dtos != null && !dtos.isEmpty()) {
			for(AbilitiesDto dto : dtos) {
				listaPojo.add(transformToPojo (dto));
			}
		}
		return listaPojo;
	}

	@Override
	public Set<AbilitiesDto> transformSetToDto(Set<Abilities> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Abilities> transformSetToPojo(Set<AbilitiesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<AbilitiesDto> transformToDto(Page<Abilities> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Abilities> transformToPojo(Page<AbilitiesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
	

}
