package br.com.joalherianamajoias.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalherianamajoias.app.entities.TipoProduto;

@Repository
public interface TipoProdutoRepository extends JpaRepository <TipoProduto, Long>{

}
