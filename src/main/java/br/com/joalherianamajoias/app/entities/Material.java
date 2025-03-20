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
@Table(name = "tb_material")
public class Material {

	// Atributos
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				@Column(name = "idMaterial", nullable = false)
				private Long idMaterial;
				
				@Column(name = "nome", unique = false)
				private String nome;
				
				@Column(name = "descricao", unique = false)
				private String descricao;
				
				@ManyToOne
				@JoinColumn(name = "PRODUTO_id_produto")
				private Produto produto;

				//Construtores
					public Material() {

					}
					public Material(Long idMaterial, String nome, String descricao) {
						this.idMaterial = idMaterial;
						this.nome = nome;
						this.descricao = descricao;
					}
					public Long getIdMaterial() {
						return idMaterial;
					}
					public void setIdMaterial(Long idMaterial) {
						this.idMaterial = idMaterial;
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
