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

import br.com.joalherianamajoias.app.entities.OrnamentosProduto;
import br.com.joalherianamajoias.app.services.OrnamentosProdutoService;

@RestController
@RequestMapping("/cadastroornamentosproduto")
public class OrnamentosProdutoController {
	@Autowired
	private OrnamentosProdutoService ornamentosprodutoService;

	@PostMapping
	public OrnamentosProduto createOrnamentosProduto(@RequestBody OrnamentosProduto ornamentosproduto) {
		return ornamentosprodutoService.saveOrnamentosProduto(ornamentosproduto);
	}

	@GetMapping
	public List<OrnamentosProduto> getAllOrnamentosProduto() {
		return ornamentosprodutoService.getAllOrnamentosProduto();
	}

	@GetMapping("/{id}")
	public OrnamentosProduto getOrnamentosProduto(@PathVariable Long id) {
		return ornamentosprodutoService.getOrnamentosProdutoById(id);
	}

	@PutMapping
	public OrnamentosProduto editOrnamentosProduto(@RequestBody OrnamentosProduto ornamentosproduto) {
		return ornamentosprodutoService.saveOrnamentosProduto(ornamentosproduto);
	}

	@DeleteMapping("/{id}")
	public void deleteOrnamentosProduto(@PathVariable Long id) {
		ornamentosprodutoService.deleteOrnamentosProduto(id);
	}

}
