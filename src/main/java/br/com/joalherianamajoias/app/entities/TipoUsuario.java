package br.com.joalherianamajoias.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipousuario")
public class TipoUsuario {
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idTipoUsuario", nullable = false)
		private Long idTipoUsuario;
		
		@Column(name = "nomeUsuario", nullable = false, length = 100)
		private String nomeUsuario;
		
		
		// Construtores
		public TipoUsuario() {

		}
		
		public TipoUsuario(Long idTipoUsuario, String nomeUsuario) {
			this.idTipoUsuario = idTipoUsuario;
			this.nomeUsuario = nomeUsuario;
}

		public Long getIdTipoUsuario() {
			return idTipoUsuario;
		}

		public void setIdTipoUsuario(Long idTipoUsuario) {
			this.idTipoUsuario = idTipoUsuario;
		}

		public String getNomeUsuario() {
			return nomeUsuario;
		}

		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
		}
		
}
