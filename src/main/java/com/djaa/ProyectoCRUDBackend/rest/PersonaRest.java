package com.djaa.ProyectoCRUDBackend.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djaa.ProyectoCRUDBackend.model.Persona;
import com.djaa.ProyectoCRUDBackend.service.PersonaService;

@RestController
@RequestMapping ("/Personas/")
public class PersonaRest {
	@Autowired
	private PersonaService personaService;
	//Rest de obtener todos los paises
	@GetMapping
	private ResponseEntity<List<Persona>> findAllPersonas (){
			return ResponseEntity.ok(personaService.findAll());
	}
	//Rest de guardar y actualizar persona
	@PostMapping
	private ResponseEntity<Persona> savePersona	(@RequestBody Persona persona){
		try {
			Persona personaGuardada = personaService.save(persona);
			return ResponseEntity.created(new URI("/Personas"+personaGuardada.getId())).body(personaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	//Rest eliminar personas por id
	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id)	{
		personaService.deleteById(id);
		return ResponseEntity.ok(!(personaService.findById(id)!=null));
	}
	
	
}
