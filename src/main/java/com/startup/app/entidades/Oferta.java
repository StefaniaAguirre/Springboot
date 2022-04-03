package com.startup.app.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "oferta")
@Inheritance(strategy = InheritanceType.JOINED)
public class Oferta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7516531881231604462L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOferta", nullable=false)
	private int idOferta;
	
	@Column(name = "notificacion", length = 300, nullable=false)
	private String notificacion;
	
	@Column(name = "fecha", nullable = false)
	@DateTimeFormat(pattern = "%Y-%m-%d")
	private Date fecha;
	
	@Column(name = "tiempoVida", nullable=false)
	private int tiempoVida;
	
	@Column(name = "esAceptada", nullable=false)
	private boolean esAceptada;
	
	@Column(name = "precioBase", nullable=false)
	private double precioBase;
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTiempoVida() {
		return tiempoVida;
	}
	public void setTiempoVida(int tiempoVida) {
		this.tiempoVida = tiempoVida;
	}
	public boolean isEsAceptada() {
		return esAceptada;
	}
	public void setEsAceptada(boolean esAceptada) {
		this.esAceptada = esAceptada;
	}
	
	
	
}
