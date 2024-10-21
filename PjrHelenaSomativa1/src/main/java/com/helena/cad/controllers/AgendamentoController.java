package com.helena.cad.controllers;
mport java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helena.cad.entities.Agendamento;
import com.helena.cad.entities.Cliente;
import com.helena.cad.services.PetshopService;


@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	private final AgendamentoService Agendamentoservice;

	@Autowired
	public AgendamentoController(AgendamentoService Agendamentoservice) {
		this.Agendamentoservice = Agendamentoservice;
	}
	
	@PostMapping
	public Agendamento createAgendamento(@RequestBody Agendamento Agendamento) {
		return Agendamentoservice.saveAgendamento(Agendamento);
	}

	@GetMapping
	public List<Agendamento> getAllAgendamento() {
		return Agendamentoservice.getAllAgendamento();
	}

	@GetMapping("/{id}")
	public Agendamento getAgendamento@PathVariable Long id) {
		return Agendamentoservice.getAgendamentoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAgendamento(@PathVariable Long id) {
		Agendamentoservice.deleteAgendamento(id);
	}
}
