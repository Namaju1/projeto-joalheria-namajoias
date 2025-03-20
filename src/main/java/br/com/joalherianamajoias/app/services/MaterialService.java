package br.com.joalherianamajoias.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalherianamajoias.app.entities.Material;
import br.com.joalherianamajoias.app.repositories.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	
	public Material saveMaterial( Material material) {
		return materialRepository.save(material);
	}
	
	public List<Material> getAllMaterial(){
		return materialRepository.findAll();
	}
	
	public Material getMaterialById (Long id) {
		return materialRepository.findById(id).orElse(null);
	}
	
	public void deleteMaterial(Long id) {
		materialRepository.deleteById(id);
	}

}
