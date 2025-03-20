package br.com.joalherianamajoias.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalherianamajoias.app.entities.TipoProduto;
import br.com.joalherianamajoias.app.repositories.TipoProdutoRepository;

@Service
public class TipoProdutoService {

	@Autowired
	private TipoProdutoRepository tipoprodutoRepository;
	
	public TipoProduto saveTipoProduto( TipoProduto tipoproduto) {
		return tipoprodutoRepository.save(tipoproduto);
	}
	
	public List<TipoProduto> getAllTipoProduto(){
		return tipoprodutoRepository.findAll();
	}
	
	public TipoProduto getTipoProdutoById (Long id) {
		return tipoprodutoRepository.findById(id).orElse(null);
	}
	
	public void deleteTipoProduto(Long id) {
		tipoprodutoRepository.deleteById(id);
	}
}
