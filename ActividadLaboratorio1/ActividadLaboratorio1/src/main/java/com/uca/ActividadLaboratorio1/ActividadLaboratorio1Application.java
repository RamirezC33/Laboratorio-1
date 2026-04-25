package com.uca.ActividadLaboratorio1;

import com.uca.ActividadLaboratorio1.domain.model.Pokemon;
import com.uca.ActividadLaboratorio1.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ActividadLaboratorio1Application {

	public static void main(String[] args) {
		SpringApplication.run(ActividadLaboratorio1Application.class, args);
	}

	@Bean
	public CommandLineRunner run(PokemonService pokemonService) {
		return args -> {
			System.out.println("\n=== Filtrar por Tipo: Agua ===");
			imprimir(pokemonService.filtrarPorTipo("Agua"));

			System.out.println("\n=== Filtrar por Zona: Bosque ===");
			imprimir(pokemonService.filtrarPorZona("Bosque"));

			System.out.println("\n=== Filtrar por Debilidad: Fuego ===");
			imprimir(pokemonService.filtrarPorDebilidad("Fuego"));
		};
	}

	private void imprimir(List<Pokemon> pokemons) {
		pokemons.forEach(p ->
			System.out.println("[PKMN] Nombre: " + p.getNombre() +
							   " | Tipo: " + p.getTipo() +
							   " | Debilidades: " + String.join(", ", p.getDebilidades()))
		);
	}

}
