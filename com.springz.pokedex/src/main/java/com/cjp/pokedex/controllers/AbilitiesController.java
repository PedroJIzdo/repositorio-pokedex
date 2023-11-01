package com.cjp.pokedex.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.pokedex.dtos.AbilitiesDto;
import com.cjp.pokedex.services.IAbilitiesService;

@RestController
@RequestMapping("/abilities")
public class AbilitiesController {

	@Autowired
	private IAbilitiesService abilitiesService;
	
	@GetMapping("/list")
	public ResponseEntity<List<AbilitiesDto>> getAllAbilities(){
		return ResponseEntity.ok().body(abilitiesService.findAllAbility());
	}
	
	@PostMapping("/create")
	public ResponseEntity<AbilitiesDto> createAbilities (@RequestBody AbilitiesDto abilitiesDto)throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(abilitiesService.saveAbility(abilitiesDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAbility (AbilitiesDto abilitiesDto)throws IllegalArgumentException, ParseException{
	
		abilitiesService.deleteAbility(abilitiesDto);
	}
}

