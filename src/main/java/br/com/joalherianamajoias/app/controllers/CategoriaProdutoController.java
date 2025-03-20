package br.com.joalherianamajoias.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalherianamajoias.app.entities.CategoriaProduto;
import br.com.joalherianamajoias.app.services.CategoriaProdutoService;

@RestController
@RequestMapping("/cadastrocategoriaproduto")
public class CategoriaProdutoController {

	@Autowired
	private CategoriaProdutoService categoriaprodutoService;

	@PostMapping
	public CategoriaProduto createCategoriaProduto(@RequestBody CategoriaProduto categoriaproduto) {
		return categoriaprodutoService.saveCategoriaProduto(categoriaproduto);
	}

	@GetMapping
	public List<CategoriaProduto> getAllCategoriaProduto() {
		return categoriaprodutoService.getAllCategoriaProduto();
	}

	@GetMapping("/{id}")
	public CategoriaProduto getCategoriaProduto(@PathVariable Long id) {
		return categoriaprodutoService.getCategoriaProdutoById(id);
	}

	@PutMapping
	public CategoriaProduto editCategoriaProduto(@RequestBody CategoriaProduto categoriaproduto) {
		return categoriaprodutoService.saveCategoriaProduto(categoriaproduto);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoriaProduto(@PathVariable Long id) {
		categoriaprodutoService.deleteCategoriaProduto(id);
}
}
