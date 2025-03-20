package br.com.joalherianamajoias.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalherianamajoias.app.entities.OrnamentosProduto;
import br.com.joalherianamajoias.app.repositories.OrnamentosProdutoRepository;

@Service
public class OrnamentosProdutoService {

	@Autowired
	private OrnamentosProdutoRepository ornamentosprodutoRepository;
	
	public OrnamentosProduto saveOrnamentosProduto( OrnamentosProduto ornamentosproduto) {
		return ornamentosprodutoRepository.save(ornamentosproduto);
	}
	
	public List<OrnamentosProduto> getAllOrnamentosProduto(){
		return ornamentosprodutoRepository.findAll();
	}
	
	public OrnamentosProduto getOrnamentosProdutoById (Long id) {
		return ornamentosprodutoRepository.findById(id).orElse(null);
	}
	
	public void deleteOrnamentosProduto(Long id) {
		ornamentosprodutoRepository.deleteById(id);
	}
}
