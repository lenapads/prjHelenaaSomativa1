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

import com.helena.cad.entities.Servico;
import com.helena.cad.services.ClienteService;


@RestController
@RequestMapping("/servico")
public class ServicoController {
	@Autowired
	public ServicoController(ServicoService Servicoservice) {
		this.Servicoservice = Servicoservice;
	}
	
	@PostMapping
	public Servico createServico(@RequestBody Servico Servico) {
		return Servicoservice.saveServico(Servico);
	}

	@GetMapping
	public List<Servico> getAllServico() {
		return Servicoservice.getAllServico();
	}

	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return Servicoservice.getServicoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteServico(@PathVariable Long id) {
		Servicoservice.deleteServico(id);
	}

}
