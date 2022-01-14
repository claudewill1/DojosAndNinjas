package com.springboot.claude.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.claude.mvc.models.Dojo;
import com.springboot.claude.mvc.models.Ninja;
import com.springboot.claude.mvc.repositories.DojoRepository;
import com.springboot.claude.mvc.repositories.NinjaRepository;

@Service
public class MainService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	
	public MainService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
		this.dojoRepository = dojoRepository;
		this.ninjaRepository = ninjaRepository;
	}
	
	// retrieve all dojos
	public List<Dojo> getAllDojos(){
		return this.dojoRepository.findAll();
	}
	// retrieve all ninjas
	public List<Ninja> getAllNinjas() {
		return this.ninjaRepository.findAll();
	}
	
	
	// create methods
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepository.save(dojo);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepository.save(ninja);
	}
	
	// get dojo by id
	public Dojo findDojoById(Long id) {
		return this.dojoRepository.findById(id).orElse(null);
	}
	
	// deletes dojo by id
	public void deleteDojo(Long id) {
		this.dojoRepository.deleteById(id);
	}
	
}
