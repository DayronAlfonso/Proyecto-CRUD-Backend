package com.djaa.ProyectoCRUDBackend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Se crea la entidad estado y se le pone nombre a la tabla
@Entity
@Table (name = "estado")
public class Estado {
	
	//Se generan los atributos de estado
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	private String nombre;
	
	//Se crea el constructor
	public Estado(Pais pais, String nombre) {
		super();
		this.pais = pais;
		this.nombre = nombre;
	}
	
	//Se generan los Getters and Setters
	
	public Pais getPais() {
		return pais;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
