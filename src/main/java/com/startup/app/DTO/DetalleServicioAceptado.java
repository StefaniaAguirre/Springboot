package com.startup.app.DTO;

public class DetalleServicioAceptado {

	private String nombre;
	private int item;
	private double precioServicio;
	private String nombreTarea;
	private String descripcion;
	public DetalleServicioAceptado(String nombre, int item, double precioServicio, String nombreTarea,String descripcion) {
		super();
		this.nombre = nombre;
		this.item = item;
		this.precioServicio = precioServicio;
		this.nombreTarea = nombreTarea;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public double getPrecioServicio() {
		return precioServicio;
	}
	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
