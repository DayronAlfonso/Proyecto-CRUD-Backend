package com.djaa.ProyectoCRUDBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djaa.ProyectoCRUDBackend.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
