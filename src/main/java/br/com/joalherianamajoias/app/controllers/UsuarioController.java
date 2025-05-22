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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalherianamajoias.app.entities.Usuario;
import br.com.joalherianamajoias.app.services.UsuarioService;

@RestController
@RequestMapping("/cadastrocliente")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@GetMapping
	public List<Usuario> getAllUsuario() {
		return usuarioService.getAllUsuario();
	}

	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}

	@PutMapping
	public Usuario editUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}
	
	//buscar por nome de usuário 
	@GetMapping("/buscarpornomeusuario")
	public Usuario getByNomeUsuario(@RequestParam String nomeUsuario) {
		return usuarioService.findByNomeUsuario(nomeUsuario);
	}
		
	@PostMapping("/login")
	public Usuario login(@RequestBody Usuario loginRequest) {
		//chama o método de autenticação do service passando o email e senha fornecidos no login 
		//1. loginRequest.getEmail() - obtem o email enviado pelo usuário na requisição
		//2. loginRequest.getSenha() - obtém a senha enviada pelo usuário na requisição
		//3. usuarioService.autenticarPessoa(email, senha) - verifica no banco se existe um usuário com este email e se a senha é válida
		//4. retorna o objeto usuario autenticado, ou null caso falha na autenticação
		Usuario pessoa = usuarioService.autenticarPessoa(loginRequest.getEmail(), loginRequest.getSenha());
		//verifica se o serviço retornou um usuário válido
		if(pessoa != null) {
		//se autenticado, retorna os dados do usuário
		return pessoa;
		//se não autenticado retorna null, indicando falha no login
		}else {
			return null;
		}
		}

}
