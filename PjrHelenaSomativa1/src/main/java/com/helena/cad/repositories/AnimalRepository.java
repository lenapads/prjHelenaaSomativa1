package com.helena.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helena.cad.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}