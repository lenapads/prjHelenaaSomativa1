package com.helena.cad.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.cad.entities.Cliente;
import com.helena.cad.entities.Produto;
import com.helena.cad.repositories.ClienteRepository;
import com.helena.cad.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	private final ProdutoRepository Produtorepository;

	@Autowired
	public ProdutoService(ProdutoRepository Produtorepository) {
		this.Produtorepository = Produtorepository;
	}

	// criação do produto
	public Produto saveProduto(Produto Produto) {
		return Produtorepository.save(Produto);
	}

	// buscar produto
	public Produto getProdutoById(Long id) {
		return Produtorepository.findById(id).orElse(null);
	}

	// procurar todos os produtos
	public List<Produto> getAllProduto() {
		return Produtorepository.findAll();
	}

	// excluir os produtos
	public void deleteProduto(Long id) {
		Produtorepository.deleteById(id);
	}
}
