package br.com.joalherianamajoias.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalherianamajoias.app.entities.TipoUsuario;
import br.com.joalherianamajoias.app.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepository tipousuarioRepository;
	
	public TipoUsuario saveTipoUsuario( TipoUsuario tipousuario) {
		return tipousuarioRepository.save(tipousuario);
	}
	
	public List<TipoUsuario> getAllTipoUsuario(){
		return tipousuarioRepository.findAll();
	}
	
	public TipoUsuario getTipoUsuarioById (Long id) {
		return tipousuarioRepository.findById(id).orElse(null);
	}
	
	public void deleteTipoUsuario(Long id) {
		tipousuarioRepository.deleteById(id);
	}
}
