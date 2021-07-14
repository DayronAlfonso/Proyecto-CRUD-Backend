package com.djaa.ProyectoCRUDBackend.model;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Se crea la entidad persona y se le pone nombre a la tabla
@Entity
@Table (name = "persona")
public class Persona {
	//Se generan los atributos de persona
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String apellido;
	private String nickname;
	private int edad;
	
	//Se crea las relaciones con otras tablas
	@Access(AccessType.PROPERTY)
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	@Access(AccessType.PROPERTY)
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;
	
	public Persona() {
		
	}
	
	//Se crea el constructor
	public Persona(String nombre, String apellido, String nickname, int edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nickname = nickname;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}
	
	//Se generan Getters and Setters
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
