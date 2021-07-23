package com.djaa.ProyectoCRUDBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djaa.ProyectoCRUDBackend.model.Pais;
import com.djaa.ProyectoCRUDBackend.repository.PaisRepository;

@Service
public class PaisService {

	@Autowired
	private PaisRepository paisRepository;

	// Metodo obtener todos los paises
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	// Metodo de obtener pais por id
	public Optional<Pais> findById(Long id) {
		return paisRepository.findById(id);
	}

}
