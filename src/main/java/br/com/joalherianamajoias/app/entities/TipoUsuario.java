package br.com.joalherianamajoias.app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
		
		@OneToMany(mappedBy = "tipoUsuario")
	    @JsonManagedReference
	    private List<Usuario> usuarios;

		public TipoUsuario(Long idTipoUsuario, String nomeUsuario, List<Usuario> usuarios) {
			this.idTipoUsuario = idTipoUsuario;
			this.nomeUsuario = nomeUsuario;
			this.usuarios = usuarios;
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

		public List<Usuario> getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(List<Usuario> usuarios) {
			this.usuarios = usuarios;
		}
	
		
		
}
