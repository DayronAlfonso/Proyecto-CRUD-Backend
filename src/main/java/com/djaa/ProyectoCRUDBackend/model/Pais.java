package com.djaa.ProyectoCRUDBackend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Se crea la entidad pais y se le pone nombre a la tabla
@Entity
@Table (name = "pais")
public class Pais {
	//Se generan los atributos de pais
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	private String nombre;
	private String presidente;
	
	//Se crea el constructor
	public Pais(String nombre, String presidente) {
		super();
		this.nombre = nombre;
		this.presidente = presidente;
	}
	
	//Se generan los Getters and Setters
	
	public String getNombre() {
		return nombre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	
}
