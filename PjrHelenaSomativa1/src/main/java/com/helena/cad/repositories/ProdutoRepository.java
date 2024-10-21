package com.helena.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helena.cad.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

