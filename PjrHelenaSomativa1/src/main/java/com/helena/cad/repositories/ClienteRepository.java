package com.helena.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helena.cad.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
