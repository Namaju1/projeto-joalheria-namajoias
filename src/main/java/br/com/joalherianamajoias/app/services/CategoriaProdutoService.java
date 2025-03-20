package br.com.joalherianamajoias.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalherianamajoias.app.entities.CategoriaProduto;
import br.com.joalherianamajoias.app.repositories.CategoriaProdutoRepository;

@Service
public class CategoriaProdutoService {

	@Autowired
	private CategoriaProdutoRepository categoriaprodutoRepository;
	
	public CategoriaProduto saveCategoriaProduto( CategoriaProduto categoriaproduto) {
		return categoriaprodutoRepository.save(categoriaproduto);
	}
	
	public List<CategoriaProduto> getAllCategoriaProduto(){
		return categoriaprodutoRepository.findAll();
	}
	
	public CategoriaProduto getCategoriaProdutoById (Long id) {
		return categoriaprodutoRepository.findById(id).orElse(null);
	}
	
	public void deleteCategoriaProduto(Long id) {
		categoriaprodutoRepository.deleteById(id);
	}
}
