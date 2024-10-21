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

import com.helena.cad.entities.Produto;
import com.helena.cad.services.ClienteService;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	public ProdutoController(ProdutoService Produtoservice) {
		this.Produtoservice = Produtoservice;
	}
	
	@PostMapping
	public Produto createProduto(@RequestBody Produto Produto) {
		return Produtoservice.saveProduto(Produto);
	}

	@GetMapping
	public List<Produto> getAllProduto() {
		return Produtoservice.getAllProduto();
	}

	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return Produtoservice.getProdutoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		Produtoservice.deleteProduto(id);
	}

}
