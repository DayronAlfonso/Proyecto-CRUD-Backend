package com.djaa.ProyectoCRUDBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djaa.ProyectoCRUDBackend.model.Persona;
import com.djaa.ProyectoCRUDBackend.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;

	//Metodo para obtener todas las personas
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}
	//Metodo para obtener la persona por id
	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	//Metodo para eliminar persona por id
	public void deleteById(Long id) {
		personaRepository.deleteById(id);
	}
	//Metodo de guardar o actualizar persona
	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

}
