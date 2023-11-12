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

import com.cjp.pokedex.dtos.EvolutionDto;
import com.cjp.pokedex.services.IEvolutionService;

@RestController
@RequestMapping("/evolution")
public class EvolutionController {
	
	@Autowired
	private IEvolutionService evolutionService;
	
	@GetMapping("/list")
	public ResponseEntity <List<EvolutionDto>> getAllEvolution(){
		return ResponseEntity.ok().body(evolutionService.findAllEvolution());
	}
	
	@PostMapping("/create")
	public ResponseEntity<EvolutionDto> createEvolution (@RequestBody EvolutionDto evolutionDto) throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(evolutionService.saveEvolution(evolutionDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEvolution (EvolutionDto evolutionDto) throws IllegalArgumentException, ParseException{
		
		evolutionService.deleteEvolution(evolutionDto);
	}
}
