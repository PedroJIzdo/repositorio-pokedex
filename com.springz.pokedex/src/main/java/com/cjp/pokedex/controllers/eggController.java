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

import com.cjp.pokedex.dtos.egggroupDto;
import com.cjp.pokedex.services.IEggGroupService;

@RestController
@RequestMapping("/egggroup")
public class eggController {

	@Autowired
	private IEggGroupService egggroupService;
	
	@GetMapping ("/list")
	public ResponseEntity<List<egggroupDto>> getAllEggGroup(){
		return ResponseEntity.ok().body(egggroupService.findAllEggGroup());
	}
	
	@PostMapping ("/create")
	public ResponseEntity<egggroupDto> createEggGroup(@RequestBody egggroupDto egggroupDto) throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(egggroupService.save(egggroupDto));
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEggGroup(egggroupDto egggroupDto) throws IllegalArgumentException, ParseException{
		
		egggroupService.deleteEggGroup(egggroupDto);
	}
}
	

