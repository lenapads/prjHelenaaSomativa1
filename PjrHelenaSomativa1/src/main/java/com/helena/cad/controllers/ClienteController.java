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

import com.helena.cad.entities.Cliente;
import com.helena.cad.services.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final ClienteService Clienteservice;

	@Autowired
	public ClienteController(ClienteService Clienteservice) {
		this.Clienteservice = Clienteservice;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente Cliente) {
		return Clienteservice.saveCliente(Cliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return Clienteservice.getAllCliente();
	}

	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return Clienteservice.getClienteById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		Clienteservice.deleteCliente(id);
	}

}
