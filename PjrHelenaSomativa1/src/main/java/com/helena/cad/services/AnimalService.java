package com.helena.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.cad.entities.Animal;
import com.helena.cad.repositories.AnimalRepository;

@Service
public class AnimalService {
	private final AnimalRepository Animalrepository;

	@Autowired
	public AnimalService(AnimalRepository Animalrepository) {
		this.Animalrepository = Animalrepository;
	}

	// criação do produto
	public Animal saveAnimal(Animal Animal) {
		return Animalrepository.save(Animal);
	}

	// buscar produto
	public Animal getAnimalById(Long id) {
		return Animalrepository.findById(id).orElse(null);
	}

	// procurar todos os produtos
	public List<Animal> getAllAnimal() {
		return Animalrepository.findAll();
	}

	// excluir os produtos
	public void deleteAnimal(Long id) {
		Animalrepository.deleteById(id);
	}

}
