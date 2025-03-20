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
@Table(name = "tb_tipousuario")
public class TipoUsuario {
	// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idTipoUsuario", nullable = false)
		private Long idTipoUsuario;
		
		@Column(name = "nome", nullable = false, length = 100)
		private String nome;
		
		@ManyToOne
		@JoinColumn(name = "USUARIO_id_usuario")
		private Usuario usuario;
		
		// Construtores
		public TipoUsuario() {

		}
		
		public TipoUsuario(Long idTipoUsuario, String nome) {
			this.idTipoUsuario = idTipoUsuario;
			this.nome = nome;
}

		public Long getIdTipoUsuario() {
			return idTipoUsuario;
		}

		public void setIdTipoUsuario(Long idTipoUsuario) {
			this.idTipoUsuario = idTipoUsuario;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		
}
