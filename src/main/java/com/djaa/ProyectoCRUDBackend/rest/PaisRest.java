package com.djaa.ProyectoCRUDBackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.djaa.ProyectoCRUDBackend.model.Pais;
import com.djaa.ProyectoCRUDBackend.service.PaisService;


@RestController
@RequestMapping ("/Pais/")
public class PaisRest {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPais(){
		return ResponseEntity.ok(paisService.findAll());
	}
	
	

}
