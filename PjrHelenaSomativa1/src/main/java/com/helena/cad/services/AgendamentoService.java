package com.helena.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.cad.entities.Agendamento;
import com.helena.cad.repositories.AgendamentoRepository;

@Service
public class AgendamentoService {
	private final AgendamentoRepository Agendamentorepository;

	@Autowired
	public AgendamentoService(AgendamentoRepository Agendamentorepository) {
		this.Agendamentorepository = Agendamentorepository;
	}

	// criação do produto
	public Agendamento saveAgendamento(Agendamento Agendamento) {
		return Agendamentorepository.save(Agendamento);
	}

	// buscar produto
	public Agendamento getAgendamentoById(Long id) {
		return Agendamentorepository.findById(id).orElse(null);
	}

	// procurar todos os produtos
	public List<Agendamento> getAllAgendamento() {
		return Agendamentorepository.findAll();
	}

	// excluir os produtos
	public void deleteAgendamento(Long id) {
		Agendamentorepository.deleteById(id);
	}

}
