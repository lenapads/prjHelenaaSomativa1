package com.helena.cad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.cad.entities.Cliente;
import com.helena.cad.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository Clienterepository;

	@Autowired
	public ClienteService(ClienteRepository Clienterepository) {
		this.Clienterepository = Clienterepository;
	}

	// criação do produto
	public Cliente saveCliente(Cliente Cliente) {
		return Clienterepository.save(Cliente);
	}

	// buscar produto
	public Cliente getClienteById(Long id) {
		return Clienterepository.findById(id).orElse(null);
	}

	// procurar todos os produtos
	public List<Cliente> getAllCliente() {
		return Clienterepository.findAll();
	}

	// excluir os produtos
	public void deleteCliente(Long id) {
		Clienterepository.deleteById(id);
	}

}
