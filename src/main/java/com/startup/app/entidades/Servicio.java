package com.startup.app.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "servicio")
@Inheritance(strategy = InheritanceType.JOINED)
public class Servicio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8205727454624235887L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idServicio", nullable=false)
	private int idServicio;
	
	@Column(name = "item", nullable=false)
	private int item;
	
	@Column(name = "descripcion", length = 100, nullable=false)
	private String descripcion;
	
	@Column(name = "precioServicio", nullable=false)
	private double precioServicio;
	
	@Column(name = "pagoRealizado")
	private boolean pagoRealizado;
	
	@Column(name = "tareaTerminada")
	private boolean tareaTerminada;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
	private Cliente idCliente;
	
	@ManyToOne
	@JoinColumn(name = "idTarea", referencedColumnName = "idTarea")
	private Tarea idTarea;
	
	@ManyToOne
	@JoinColumn(name = "idOferta", referencedColumnName = "idOferta")
	private Oferta idOferta;
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
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
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	public Tarea getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Tarea idTarea) {
		this.idTarea = idTarea;
	}
	public Oferta getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(Oferta idOferta) {
		this.idOferta = idOferta;
	}
	
}