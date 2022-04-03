package com.startup.app.DTO;

public class ServicioCreadoCliente {
	
	public String nombreTarea;
	public String descripcion;
	public double precioServicio;
	public boolean pagoRealizado;
	public boolean tareaTerminada;
	public boolean esAceptada;
	
	public ServicioCreadoCliente(String nombreTarea, String descripcion, double precioServicio, boolean pagoRealizado,
			boolean tareaTerminada, boolean esAceptada) {
		super();
		this.nombreTarea = nombreTarea;
		this.descripcion = descripcion;
		this.precioServicio = precioServicio;
		this.pagoRealizado = pagoRealizado;
		this.tareaTerminada = tareaTerminada;
		this.esAceptada = esAceptada;
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
	public double getPrecioServicio() {
		return precioServicio;
	}
	public void setPrecioServicio(double precioServicio) {
		this.precioServicio = precioServicio;
	}
	public boolean isPagoRealizado() {
		return pagoRealizado;
	}
	public void setPagoRealizado(boolean pagoRealizado) {
		this.pagoRealizado = pagoRealizado;
	}
	public boolean isTareaTerminada() {
		return tareaTerminada;
	}
	public void setTareaTerminada(boolean tareaTerminada) {
		this.tareaTerminada = tareaTerminada;
	}
	public boolean isEsAceptada() {
		return esAceptada;
	}
	public void setEsAceptada(boolean esAceptada) {
		this.esAceptada = esAceptada;
	}
	
}
