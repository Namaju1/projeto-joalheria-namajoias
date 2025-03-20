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

import br.com.joalherianamajoias.app.entities.TipoProduto;
import br.com.joalherianamajoias.app.services.TipoProdutoService;

@RestController
@RequestMapping("/cadastrotipoproduto")
public class TipoProdutoController {
	@Autowired
	private TipoProdutoService tipoprodutoService;

	@PostMapping
	public TipoProduto createTipoProduto(@RequestBody TipoProduto tipoproduto) {
		return tipoprodutoService.saveTipoProduto(tipoproduto);
	}

	@GetMapping
	public List<TipoProduto> getAllTipoProduto() {
		return tipoprodutoService.getAllTipoProduto();
	}

	@GetMapping("/{id}")
	public TipoProduto getTipoProduto(@PathVariable Long id) {
		return tipoprodutoService.getTipoProdutoById(id);
	}

	@PutMapping
	public TipoProduto editTipoProduto(@RequestBody TipoProduto tipoproduto) {
		return tipoprodutoService.saveTipoProduto(tipoproduto);
	}

	@DeleteMapping("/{id}")
	public void deleteTipoProduto(@PathVariable Long id) {
		tipoprodutoService.deleteTipoProduto(id);
	}

}
