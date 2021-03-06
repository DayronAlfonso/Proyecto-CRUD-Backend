package com.djaa.ProyectoCRUDBackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djaa.ProyectoCRUDBackend.model.Estado;
import com.djaa.ProyectoCRUDBackend.service.EstadoService;

@RestController
@RequestMapping("/Estados/")
public class EstadoRest {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadoByPais (@PathVariable Long id){
		return ResponseEntity.ok(estadoService.findAllByPais(id));
	}
	
}
