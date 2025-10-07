package com.sharito.demo.db.dto;

public class PersonaDto {

	private Integer id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;

	public PersonaDto() {
		super();
	}

	public PersonaDto(Integer id, String nombre, String primerApellido, String segundoApellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}

	public Integer getId() {
		
		
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

}
