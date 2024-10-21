package com.helena.cad.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "/servico")
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private String profissional;
	private String pet;
	
	
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

	public String getprofissional() {
		return profissional;
	}

	public void setprofissional(String profissional) {
		this.profissional = profissional;
	}
	public String getpet() {
		return pet;
	}

	public void setpet(String pet) {
		this.pet = pet;
	}
	

}
