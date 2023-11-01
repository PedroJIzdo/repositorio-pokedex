package com.cjp.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.pokedex.entities.egggroup;

public interface EggGroupRepository extends JpaRepository<egggroup, Long> {

}
