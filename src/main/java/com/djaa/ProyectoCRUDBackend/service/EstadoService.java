package com.djaa.ProyectoCRUDBackend.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.djaa.ProyectoCRUDBackend.model.Estado;
import com.djaa.ProyectoCRUDBackend.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	//Metodo de obtener todos los estados
	
	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}
	
	//Metodo de busqueda por id del pais
	
	public List<Estado> findAllByPais (Long id){
		List<Estado>respuestaEstado= new ArrayList<>();
		List<Estado>estados = estadoRepository.findAll();
		for (int i = 0; i < estados.size(); i++) {
			if (estados.get(i).getPais().getId()==id) {
				respuestaEstado.add(estados.get(i));
			};
		}
		return respuestaEstado;
	}


}
