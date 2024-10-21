package com.helena.cad.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "/produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private String preco;
	private String estoque;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getpreco() {
		return preco;
	}

	public void setpreco(String preco) {
		this.preco = preco;
	}
	public String getestoque() {
		return estoque;
	}

	public void setestoque(String estoque) {
		this.estoque = estoque;
	}
	

}
