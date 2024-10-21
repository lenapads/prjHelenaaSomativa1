package com.helena.cad.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "/agendamento")
	public class Agendamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private int horario;
		private int preco;
		private String pet;
		private String data;
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getHorario() {
			return horario;
		}

		public void sethorario(int horario) {
			this.horario = horario;
		}

		public int getPreco() {
			return preco;
		}

		public void setPreco(int preco) {
			this.preco = preco;
		}
		public String getPet() {
			return pet;
		}

		public void setPet(String pet) {
			this.pet = pet;
		}
		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		


}
