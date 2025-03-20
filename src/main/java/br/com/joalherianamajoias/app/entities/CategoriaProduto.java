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
@Table(name = "tb_categoriaproduto")
public class CategoriaProduto {

	// Atributos
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "idCategoriaUsuario", nullable = false)
			private Long idCategoriaProduto;
			
			@Column(name = "nome", nullable = false, length = 100)
			private String nome;
			
			@Column(name = "descricao", nullable = false, length = 100)
			private String descricao;
			
			@ManyToOne
			@JoinColumn(name = "PRODUTO_id_produto")
			private Produto produto;
			
			// Construtores
			public CategoriaProduto() {

			}

			public CategoriaProduto(Long idCategoriaProduto, String nome, String descricao) {
				this.idCategoriaProduto = idCategoriaProduto;
				this.nome = nome;
				this.descricao = descricao;
}

			public Long getIdCategoriaProduto() {
				return idCategoriaProduto;
			}

			public void setIdCategoriaProduto(Long idCategoriaProduto) {
				this.idCategoriaProduto = idCategoriaProduto;
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

			public Produto getProduto() {
				return produto;
			}

			public void setProduto(Produto produto) {
				this.produto = produto;
			}
			
}