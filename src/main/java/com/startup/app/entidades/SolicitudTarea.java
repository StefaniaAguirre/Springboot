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
@Table(name = "solicitudtarea")
@Inheritance(strategy = InheritanceType.JOINED)
public class SolicitudTarea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8905932657693476701L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSolicitudTarea", nullable=false)
	private int idSolicitudTarea;
	
	@Column(name = "nombre", length = 30, nullable=false)
	private String nombre;
	
	@Column(name = "descripcion", length = 100, nullable=false)
	private String descripcion;
	
	@Column(name = "estado", nullable=false)
	private boolean estado;
	
	@Column(name = "notificacion", length = 100, nullable=false)
	private String notificacion;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
	private Cliente idCliente;
	
	@ManyToOne
	@JoinColumn(name = "idHacedor", referencedColumnName = "idHacedor")
	private Hacedor idHacedor;
	
	@ManyToOne
	@JoinColumn(name = "idAdministrador", referencedColumnName = "idAdministrador")
	private Administrador idAdministrador;
	
	public int getIdSolicitudTarea() {
		return idSolicitudTarea;
	}
	public void setIdSolicitudTarea(int idSolicitudTarea) {
		this.idSolicitudTarea = idSolicitudTarea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getNotificacion() {
		return notificacion;
	}
	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	public Hacedor getIdHacedor() {
		return idHacedor;
	}
	public void setIdHacedor(Hacedor idHacedor) {
		this.idHacedor = idHacedor;
	}
	public Administrador getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(Administrador idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	
}