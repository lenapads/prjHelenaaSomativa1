package com.helena.cad.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.cad.entities.Servico;
import com.helena.cad.repositories.ServicoRepository;

@Service
public class ServicoService {
	private final ServicoRepository Servicorepository;

	@Autowired
	public ServicoService(ServicoRepository Servicorepository) {
		this.Servicorepository = Servicorepository;
	}

	// criação do produto
	public Servico saveServico(Servico Servico) {
		return Servicorepository.save(Servico);
	}

	// buscar produto
	public Servico getServicoById(Long id) {
		return Servicorepository.findById(id).orElse(null);
	}

	// procurar todos os produtos
	public List<Servico> getAllServico() {
		return Servicorepository.findAll();
	}

	// excluir os produtos
	public void deleteServicoLong id) {
		Servicorepository.deleteById(id);
	}

}
