package com.startup.app.DTO;

public class OfertaHacedor {

	public int idOferta;
	public String nombreTarea;
	public String notificacion;
	public boolean esAceptada;
	public int tiempoVida;
	public double precioBase;
	
	
	public OfertaHacedor(int idOferta, String nombreTarea, String notificacion, boolean esAceptada, int tiempoVida,
			double precioBase) {
		super();
		this.idOferta = idOferta;
		this.nombreTarea = nombreTarea;
		this.notificacion = notificacion;
		this.esAceptada = esAceptada;
		this.tiempoVida = tiempoVida;
		this.precioBase = precioBase;
	}
	
	public String getNotificacion() {
		return notificacion;
	}
	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}
	public String getNombreTarea() {
		return nombreTarea;
	}
	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}
	public boolean isEsAceptada() {
		return esAceptada;
	}
	public void setEsAceptada(boolean esAceptada) {
		this.esAceptada = esAceptada;
	}
	public int getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}
	public int getTiempoVida() {
		return tiempoVida;
	}
	public void setTiempoVida(int tiempoVida) {
		this.tiempoVida = tiempoVida;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	
}
