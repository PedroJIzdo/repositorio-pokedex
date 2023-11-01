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

import com.cjp.pokedex.dtos.TypeDto;
import com.cjp.pokedex.services.ITypeService;

@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private ITypeService typeService;
	
	@GetMapping("/list")
	public ResponseEntity<List<TypeDto>> getAllType(){
		return ResponseEntity.ok().body(typeService.findAllType());
		
	}
	
	@PostMapping ("/create")
	public ResponseEntity<TypeDto> createType (@RequestBody TypeDto typeDto)throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(typeService.saveType(typeDto));
	}
	
	@DeleteMapping("/delte/{id}")
	public void deleteType (TypeDto typeDto) throws IllegalArgumentException, ParseException{
		
		typeService.deleteType(typeDto);
	}
}
