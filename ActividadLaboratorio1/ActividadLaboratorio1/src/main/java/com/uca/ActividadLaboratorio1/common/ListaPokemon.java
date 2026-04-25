package com.uca.ActividadLaboratorio1.common;

import com.uca.ActividadLaboratorio1.domain.model.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaPokemon {

    private final List<Pokemon> pokemons;

    public ListaPokemon() {
        this.pokemons = new ArrayList<>();
        this.pokemons.add(Pokemon.builder().nombre("Bulbasaur").tipo("Planta").debilidades(List.of("Fuego", "Hielo", "Veneno", "Volador", "Psíquico")).zonas(List.of("Bosque", "Hierba Alta")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Charmander").tipo("Fuego").debilidades(List.of("Agua", "Roca", "Tierra")).zonas(List.of("Cueva", "Montaña")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Squirtle").tipo("Agua").debilidades(List.of("Planta", "Eléctrico")).zonas(List.of("Mar", "Lago")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Pikachu").tipo("Eléctrico").debilidades(List.of("Tierra")).zonas(List.of("Bosque", "Hierba Alta")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Geodude").tipo("Roca").debilidades(List.of("Agua", "Planta", "Lucha", "Tierra", "Acero")).zonas(List.of("Cueva")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Magikarp").tipo("Agua").debilidades(List.of("Planta", "Eléctrico")).zonas(List.of("Mar", "Lago")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Caterpie").tipo("Bicho").debilidades(List.of("Fuego", "Volador", "Roca")).zonas(List.of("Bosque", "Hierba Alta")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Jigglypuff").tipo("Normal").debilidades(List.of("Lucha")).zonas(List.of("Hierba Alta")).region("Kanto").build());
        this.pokemons.add(Pokemon.builder().nombre("Cyndaquil").tipo("Fuego").debilidades(List.of("Agua", "Roca", "Tierra")).zonas(List.of("Cueva")).region("Johto").build());
        this.pokemons.add(Pokemon.builder().nombre("Treecko").tipo("Planta").debilidades(List.of("Fuego", "Hielo", "Veneno", "Volador", "Psíquico")).zonas(List.of("Bosque")).region("Hoenn").build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
