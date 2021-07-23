package com.djaa.ProyectoCRUDBackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.djaa.ProyectoCRUDBackend.model.Pais;
import com.djaa.ProyectoCRUDBackend.service.PaisService;


@RestController
@RequestMapping ("/Pais/")
public class PaisRest {
	
	@Autowired
	private PaisService paisService;
	 
	//Rest de obtener todos los paises
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPais(){
		return ResponseEntity.ok(paisService.findAll());
	}
	//Rest de obtener paises por id 
	@GetMapping ("{id}")
	private ResponseEntity<Optional<Pais>> getAllByPais(@PathVariable Long id){
		Optional<Pais> queryPais = paisService.findById(id);
		return ResponseEntity.ok(queryPais);
	}
	

}
