package com.cjp.pokedex.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.pokedex.dtos.TypeDto;
import com.cjp.pokedex.entities.Type;

@Component
public class TypeMapper implements ModelMapper<Type, TypeDto>{

	@Override
	public TypeDto transformToDto(Type entity) {
		// TODO Esbozo de método generado automáticamente
		TypeDto dto = new TypeDto();
		if(dto != null) {
			dto.setIDtype(entity.getIDtype());
			dto.setTypeName(entity.getTypeName());
			
		}
		return dto;
	}

	@Override
	public Type transformToPojo(TypeDto dto) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		Type entity = new Type();
		if (entity != null) {
			entity.setIDtype(dto.getIDtype());
			entity.setTypeName(dto.getTypeName());
		}
		return entity;
	}

	@Override
	public List<TypeDto> transformToDto(List<Type> entities) {
		// TODO Esbozo de método generado automáticamente
		List<TypeDto> listaDto = new ArrayList();
		if(entities != null && !entities.isEmpty()) {
			for(Type entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}
		return listaDto;
	}

	@Override
	public List<Type> transformToPojo(List<TypeDto> dtos) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		List<Type> listaPojo = new ArrayList();
		if(dtos != null && !dtos.isEmpty()) {
			for(TypeDto dto :dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}
		return listaPojo;
	}

	@Override
	public Set<TypeDto> transformSetToDto(Set<Type> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Type> transformSetToPojo(Set<TypeDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<TypeDto> transformToDto(Page<Type> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Type> transformToPojo(Page<TypeDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
	

}
