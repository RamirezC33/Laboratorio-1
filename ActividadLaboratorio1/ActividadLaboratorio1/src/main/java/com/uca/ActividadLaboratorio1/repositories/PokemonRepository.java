package com.uca.ActividadLaboratorio1.repositories;

import com.uca.ActividadLaboratorio1.common.ListaPokemon;
import com.uca.ActividadLaboratorio1.domain.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {

    private final ListaPokemon listaPokemon;

    public List<Pokemon> findAll() {
        return listaPokemon.getPokemons();
    }
}
