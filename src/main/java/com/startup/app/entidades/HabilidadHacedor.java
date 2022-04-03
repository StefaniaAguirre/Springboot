package com.startup.app.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "habilidadtareahacedor")
@Inheritance(strategy = InheritanceType.JOINED)
public class HabilidadHacedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4337043763334190890L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHabilidadHacedor", nullable=false)
	private int idHabilidadHacedor;

	@ManyToOne
	@JoinColumn(name = "idHacedor", referencedColumnName = "idHacedor")
	private Hacedor idHacedor;
	
	@ManyToOne
	@JoinColumn(name = "idTarea", referencedColumnName = "idTarea")
	private Tarea idTarea;

	@Column(name = "radio",length = 45, nullable = false)
	private String radio;
	
	@Column(name = "precioHabilidad", nullable = false)
	private double precioHabilidad;
	
	public double getPrecioHabilidad() {
		return precioHabilidad;
	}

	public void setPrecioHabilidad(double precioHabilidad) {
		this.precioHabilidad = precioHabilidad;
	}

	public int getIdHabilidadHacedor() {
		return idHabilidadHacedor;
	}

	public void setIdHabilidadHacedor(int idHabilidadHacedor) {
		this.idHabilidadHacedor = idHabilidadHacedor;
	}

	public Hacedor getIdHacedor() {
		return idHacedor;
	}

	public void setIdHacedor(Hacedor idHacedor) {
		this.idHacedor = idHacedor;
	}

	public Tarea getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Tarea idTarea) {
		this.idTarea = idTarea;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	
}
