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
@Table(name = "tb_tipoproduto")
public class TipoProduto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProduto", nullable = false)
	private Long idTipoProduto;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "PRODUTO_id_produto")
	private Produto produto;

	// Construtores
	public TipoProduto() {

	}
	public TipoProduto(Long idTipoProduto, String descricao, String nome, Produto produto) {
		this.idTipoProduto = idTipoProduto;
		this.descricao = descricao;
		this.nome = nome;
		this.produto = produto;
	}
	public Long getIdTipoProduto() {
		return idTipoProduto;
	}
	public void setIdTipoProduto(Long idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
