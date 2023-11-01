package com.cjp.pokedex.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.pokedex.dtos.egggroupDto;
import com.cjp.pokedex.entities.egggroup;

@Component
public class EggGroupMapper implements ModelMapper<egggroup, egggroupDto>{

	@Override
	public egggroupDto transformToDto(egggroup entity) {
		// TODO Esbozo de método generado automáticamente
		egggroupDto dto = new egggroupDto();
		if(dto !=null) {
			dto.setEggName(entity.getEggName());
			dto.setId_egg(entity.getId_egg());
		}
		return dto;
	}

	@Override
	public egggroup transformToPojo(egggroupDto dto) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		egggroup entity = new egggroup();
		if (entity != null) {
			entity.setEggName(dto.getEggName());
			entity.setId_egg(dto.getId_egg());
		}
		return entity;
	}

	@Override
	public List<egggroupDto> transformToDto(List<egggroup> entities) {
		// TODO Esbozo de método generado automáticamente
		List<egggroupDto> listaDto = new ArrayList();
		if (entities !=null && !entities.isEmpty()) {
			for (egggroup entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}
		return listaDto;
	}

	@Override
	public List<egggroup> transformToPojo(List<egggroupDto> dtos) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		List<egggroup> listaPojo = new ArrayList();
		if(dtos != null && !dtos.isEmpty()) {
			for (egggroupDto dto : dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}
		return listaPojo;
	}

	@Override
	public Set<egggroupDto> transformSetToDto(Set<egggroup> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<egggroup> transformSetToPojo(Set<egggroupDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<egggroupDto> transformToDto(Page<egggroup> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<egggroup> transformToPojo(Page<egggroupDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
	

}
