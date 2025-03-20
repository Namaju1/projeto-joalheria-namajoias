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

import br.com.joalherianamajoias.app.entities.TipoUsuario;
import br.com.joalherianamajoias.app.services.TipoUsuarioService;

@RestController
@RequestMapping("/cadastrotipousuario")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipousuarioService;

	@PostMapping
	public TipoUsuario createTipoUsuario(@RequestBody TipoUsuario tipousuario) {
		return tipousuarioService.saveTipoUsuario(tipousuario);
	}

	@GetMapping
	public List<TipoUsuario> getAllTipoUsuario() {
		return tipousuarioService.getAllTipoUsuario();
	}

	@GetMapping("/{id}")
	public TipoUsuario getTipoUsuario(@PathVariable Long id) {
		return tipousuarioService.getTipoUsuarioById(id);
	}

	@PutMapping
	public TipoUsuario editTipoUsuario(@RequestBody TipoUsuario tipousuario) {
		return tipousuarioService.saveTipoUsuario(tipousuario);
	}

	@DeleteMapping("/{id}")
	public void deleteTipoUsuario(@PathVariable Long id) {
		tipousuarioService.deleteTipoUsuario(id);
	}
}
