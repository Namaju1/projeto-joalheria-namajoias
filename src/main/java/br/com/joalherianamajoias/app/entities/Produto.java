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
@Table(name = "tb_produto")
public class Produto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto", nullable = false)
	private Long idProduto;

	@Column(name = "nomeProduto", unique = false)
	private String nomeProduto;

	@Column(name = "descricao", nullable = false, length = 300, unique = false)
	private String descricao;

	@Column(name = "preco", nullable = false, length = 100)
	private double preco;

	@Column(name = "imgUrl", nullable = false, length = 1000, unique = false)
	private String imgUrl;

	@ManyToOne
    @JoinColumn(name = "tipo_produto", nullable = false)
    private TipoProduto tipoProduto;
    
    @ManyToOne
    @JoinColumn(name ="categoriaProduto", nullable = true)
    private CategoriaProduto categoriaProduto;
    
    @ManyToOne
    @JoinColumn(name ="ornamentosProduto", nullable = true)
    private Ornamentos ornamentos;

//Construtores
	public Produto() {

	}

	public Produto(Long idProduto, String nomeProduto, String descricao, double preco, String imgUrl, TipoProduto tipoProduto, CategoriaProduto categoriaProduto, Ornamentos ornamentos ) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.imgUrl = imgUrl;
		this.tipoProduto = tipoProduto;
	    this.categoriaProduto = categoriaProduto;
	    this.ornamentos = ornamentos;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public Ornamentos getOrnamentos() {
		return ornamentos;
	}

	public void setOrnamentos(Ornamentos ornamentos) {
		this.ornamentos = ornamentos;
	}	
}