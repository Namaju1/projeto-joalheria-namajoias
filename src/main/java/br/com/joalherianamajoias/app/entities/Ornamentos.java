package br.com.joalherianamajoias.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamentos")
public class Ornamentos {

	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idOrnamentos", nullable = false)
		private Long idOrnamentos;

		@Column(name = "nome", unique = false)
		private String nome;
		
		@Column(name = "descricao", unique = false)
		private String descricao;
		
		//Construtores
		public Ornamentos() {

		}
		public Ornamentos(Long idOrnamentos, String nome, String descricao) {
			this.idOrnamentos = idOrnamentos;
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public Long getIdOrnamentos() {
			return idOrnamentos;
		}
		public void setIdOrnamentos(Long idOrnamentos) {
			this.idOrnamentos = idOrnamentos;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
}
