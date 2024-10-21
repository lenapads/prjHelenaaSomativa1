package com.helena.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helena.cad.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
