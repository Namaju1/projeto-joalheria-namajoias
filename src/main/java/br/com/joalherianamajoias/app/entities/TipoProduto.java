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
			
			@ManyToOne
			@JoinColumn(name = "PRODUTO_id_produto")
			private Produto produto;

			// Construtores
			public TipoProduto() {

			}
			
			public TipoProduto(Long idTipoProduto, String descricao) {
				this.idTipoProduto = idTipoProduto;
				this.descricao = descricao;
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

			public Produto getProduto() {
				return produto;
			}

			public void setProduto(Produto produto) {
				this.produto = produto;
			}
			
}
