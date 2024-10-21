package com.helena.cad.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helena.cad.entities.Animal;
import com.helena.cad.services.ClienteService;


@RestController
@RequestMapping("/animal")
public class AnimalController {
	private final AnimalService Animalservice;

	@Autowired
	public AnimalController(AnimalService Animalservice) {
		this.Animalservice = Animalservice;
	}
	
	@PostMapping
	public Animal createAnimal(@RequestBody Animal Animal) {
		return Animalservice.saveAnimal(Animal);
	}

	@GetMapping
	public List<Animal> getAllAnimal() {
		return Animalservice.getAllAnimal();
	}

	@GetMapping("/{id}")
	public Animal getAnimal(@PathVariable Long id) {
		return Animalservice.getAnimalById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAnimal(@PathVariable Long id) {
		Animalservice.deleteAnimal(id);
	}

}
