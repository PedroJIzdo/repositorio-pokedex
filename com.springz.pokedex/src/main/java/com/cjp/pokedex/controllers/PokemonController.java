package com.cjp.pokedex.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.pokedex.dtos.PokemonDto;
import com.cjp.pokedex.services.IPokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	private IPokemonService pokemonService;
	
	@GetMapping("/list")
	public ResponseEntity<List<PokemonDto>> getAllPokemon(){
		return ResponseEntity.ok().body(pokemonService.findAllPokemon());
	}
	
	@PostMapping("/create")
	public ResponseEntity<PokemonDto> createPokemon(@RequestBody PokemonDto pokemonDto)throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(pokemonService.save(pokemonDto));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<PokemonDto> updatePokemon (@PathVariable Long id, @RequestBody PokemonDto pokemonDto) throws ParseException{
		return ResponseEntity.ok().body(pokemonService.update(pokemonDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePokemon(PokemonDto pokemonDto) throws IllegalArgumentException, ParseException{
		
		pokemonService.deletePokemon(pokemonDto);
	}
}
