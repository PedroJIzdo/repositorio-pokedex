package com.cjp.pokedex.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Evolution {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Relacion entre pokemon y sus evoluciones
    @OneToOne
    @JoinColumn(name = "original_pokemon_id")
    private Pokemon originalPokemon;

    @OneToOne
    @JoinColumn(name = "evolved_pokemon_id")
    private Pokemon evolvedPokemon;

    // Otros campos y métodos getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pokemon getOriginalPokemon() {
        return originalPokemon;
    }

    public void setOriginalPokemon(Pokemon originalPokemon) {
        this.originalPokemon = originalPokemon;
    }

    public Pokemon getEvolvedPokemon() {
        return evolvedPokemon;
    }

    public void setEvolvedPokemon(Pokemon evolvedPokemon) {
        this.evolvedPokemon = evolvedPokemon;
    }
}
