package com.startup.app.DTO;

public class OfertaCliente {
	
	public int idServicio;
	public int idOferta;
	public String notificacion;
	public boolean ofertaAceptada;
	public  double precioBase;
	
	public OfertaCliente(int idServicio, int idOferta, String notificacion, boolean ofertaAceptada, double precioBase) {
		super();
		this.idServicio = idServicio;
		this.idOferta = idOferta;
		this.notificacion = notificacion;
		this.ofertaAceptada = ofertaAceptada;
		this.precioBase = precioBase;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public int getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}

	public boolean isOfertaAceptada() {
		return ofertaAceptada;
	}

	public void setOfertaAceptada(boolean ofertaAceptada) {
		this.ofertaAceptada = ofertaAceptada;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	
}
