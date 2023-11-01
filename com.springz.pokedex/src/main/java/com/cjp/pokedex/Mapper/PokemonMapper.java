package com.cjp.pokedex.Mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.pokedex.dtos.AbilitiesDto;
import com.cjp.pokedex.dtos.PokemonDto;
import com.cjp.pokedex.dtos.TypeDto;
import com.cjp.pokedex.dtos.egggroupDto;
import com.cjp.pokedex.entities.Abilities;
import com.cjp.pokedex.entities.Pokemon;
import com.cjp.pokedex.entities.Type;
import com.cjp.pokedex.entities.egggroup;

@Component
public class PokemonMapper implements ModelMapper<Pokemon, PokemonDto>{

	@Override
	public PokemonDto transformToDto(Pokemon entity) {
		PokemonDto dto = new PokemonDto();
		if (dto != null) {
			dto.setAttack(entity.getAttack());
			dto.setDefense(entity.getDefense());
			dto.setDualtype(entity.getDualtype());
			dto.setHp(entity.getHp());
			dto.setId_pokemon(entity.getId_pokemon());
			dto.setSpattack(entity.getSpattack());
			dto.setSpdefense(entity.getSpdefense());
			dto.setSpeed(entity.getSpeed());
			dto.setName(entity.getName());
			dto.setDescription(entity.getDescription());
			
			egggroupDto firstEggGroupDto = new egggroupDto();
			egggroupDto secondEggGroupDto = new egggroupDto();
			
			if(entity.getFirstEgg()!= null) {
				firstEggGroupDto.setId_egg(entity.getFirstEgg().getId_egg());
				firstEggGroupDto.setEggName(entity.getFirstEgg().getEggName());
			}
			
			if(entity.getSecondEgg()!= null) {
				secondEggGroupDto.setId_egg(entity.getSecondEgg().getId_egg());
				secondEggGroupDto.setEggName(entity.getSecondEgg().getEggName());
			}
			
			dto.setFirstEgg(firstEggGroupDto);
			dto.setSecondEgg(secondEggGroupDto);
			
			TypeDto firstTypeDto = new TypeDto();
			TypeDto secondTypeDto = new TypeDto();
			
			if(entity.getFirstType() != null) {
				firstTypeDto.setIDtype(entity.getFirstType().getIDtype());
				firstTypeDto.setTypeName(entity.getFirstType().getTypeName());
			}
			
			if(entity.getSecondType() != null) {
				secondTypeDto.setIDtype(entity.getSecondType().getIDtype());
				secondTypeDto.setTypeName(entity.getSecondType().getTypeName());
			}
			
			dto.setFirstType(firstTypeDto);
			dto.setSecondType(secondTypeDto);
			
			AbilitiesDto abilityDto = new AbilitiesDto();
			AbilitiesDto hiddenAbilitiesDto = new AbilitiesDto();
			
			if(entity.getAbility() != null) {
				abilityDto.setIDability(entity.getAbility().getIDability());
				abilityDto.setAbilityName(entity.getAbility().getAbilityName());
			}
			
			if(entity.getHiddenAbility() != null) {
				hiddenAbilitiesDto.setIDability(entity.getHiddenAbility().getIDability());
				hiddenAbilitiesDto.setAbilityName(entity.getHiddenAbility().getAbilityName());;
			}
			
			dto.setFirstType(firstTypeDto);
			dto.setSecondType(secondTypeDto);

			
		}
		// TODO Esbozo de método generado automáticamente
		return dto;
	}

	@Override
	public Pokemon transformToPojo(PokemonDto dto) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		Pokemon entity = new Pokemon ();
		if (entity != null) {
			entity.setAttack(dto.getAttack());
			entity.setDefense(dto.getDefense());
			entity.setDualtype(dto.getDualtype());
			entity.setHp(dto.getHp());
			entity.setId_pokemon(dto.getId_pokemon());
			entity.setSpattack(dto.getSpattack());
			entity.setSpdefense(dto.getSpdefense());
			entity.setSpeed(dto.getSpeed());
			entity.setName(dto.getName());
			entity.setDescription(dto.getDescription());
			
			Abilities abilityEntity = new Abilities();
			Abilities hiddenAbilityEntity = new Abilities();
			
			if(abilityEntity != null) {
				abilityEntity.setAbilityName(dto.getAbility().getAbilityName());
				abilityEntity.setIDability(dto.getAbility().getIDability());
			}
			if(hiddenAbilityEntity != null) {
				hiddenAbilityEntity.setAbilityName(dto.getAbility().getAbilityName());
				hiddenAbilityEntity.setIDability(dto.getAbility().getIDability());
			}
			
			entity.setAbility(abilityEntity);
			entity.setAbility(hiddenAbilityEntity);
			
			Type firstTypeEntity = new Type();
			Type secondTypeEntity = new Type();
			
			if(firstTypeEntity != null) {
				firstTypeEntity.setIDtype(dto.getFirstType().getIDtype());
				firstTypeEntity.setTypeName(dto.getFirstType().getTypeName());
			}
			if(secondTypeEntity != null) {
				secondTypeEntity.setIDtype(dto.getSecondType().getIDtype());
				secondTypeEntity.setTypeName(dto.getSecondType().getTypeName());
			}
			
			entity.setFirstType(firstTypeEntity);
			entity.setSecondType(secondTypeEntity);
			
			egggroup firstEggGroupEntity = new egggroup();
			egggroup secondEggGroupEntity = new egggroup();
			
			if(firstEggGroupEntity != null) {
				firstEggGroupEntity.setEggName(dto.getFirstEgg().getEggName());
				firstEggGroupEntity.setId_egg(dto.getFirstEgg().getId_egg());
			}
			if(secondEggGroupEntity != null) {
				secondEggGroupEntity.setEggName(dto.getSecondEgg().getEggName());
				secondEggGroupEntity.setId_egg(dto.getSecondEgg().getId_egg());
			}
			
			entity.setFirstEgg(firstEggGroupEntity);
			entity.setSecondEgg(secondEggGroupEntity);
			
		}
		return entity;
	}

	@Override
	public List<PokemonDto> transformToDto(List<Pokemon> entities) {
		// TODO Esbozo de método generado automáticamente
		List<PokemonDto> listaDto = new ArrayList();
		if (entities != null && !entities.isEmpty()){
			for (Pokemon entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}
		return listaDto;
	}

	@Override
	public List<Pokemon> transformToPojo(List<PokemonDto> dtos) throws ParseException {
		// TODO Esbozo de método generado automáticamente
		List<Pokemon> listaPojo = new ArrayList();
		if (dtos != null && !dtos.isEmpty()){
			for (PokemonDto dto : dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}
		return listaPojo;
	}

	@Override
	public Set<PokemonDto> transformSetToDto(Set<Pokemon> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Pokemon> transformSetToPojo(Set<PokemonDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<PokemonDto> transformToDto(Page<Pokemon> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Pokemon> transformToPojo(Page<PokemonDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}



}
