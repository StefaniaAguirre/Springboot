package com.startup.app.DTO;

public class DetallesHabilidadHacedor {

	public String nombre;
	public int edad;
	public String nombreTarea;
	public String definicion;
	public double precio;
	public int idTarea;

	public DetallesHabilidadHacedor(String nombre, int edad, String nombreTarea, String definicion, double precio,
			int idTarea) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nombreTarea = nombreTarea;
		this.definicion = definicion;
		this.precio = precio;
		this.idTarea = idTarea;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombreTarea() {
		return nombreTarea;
	}


	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}


	public String getDefinicion() {
		return definicion;
	}


	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getIdTarea() {
		return idTarea;
	}


	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}
	
	
	
	
	
}
