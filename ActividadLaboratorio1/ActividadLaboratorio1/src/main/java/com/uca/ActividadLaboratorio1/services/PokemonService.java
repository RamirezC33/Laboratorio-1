package com.uca.ActividadLaboratorio1.services;

import com.uca.ActividadLaboratorio1.domain.model.Pokemon;
import com.uca.ActividadLaboratorio1.repositories.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return pokemonRepository.findAll().stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .toList();
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return pokemonRepository.findAll().stream()
                .filter(p -> p.getZonas().stream().anyMatch(z -> z.equalsIgnoreCase(zona)))
                .toList();
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return pokemonRepository.findAll().stream()
                .filter(p -> p.getDebilidades().stream().anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .toList();
    }
}
