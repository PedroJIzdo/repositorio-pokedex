package com.cjp.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.pokedex.entities.Type;

public interface TypeRepository  extends JpaRepository<Type, Long>{

}
