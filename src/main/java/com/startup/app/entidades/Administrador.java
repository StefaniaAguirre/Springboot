package com.startup.app.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
@Inheritance(strategy = InheritanceType.JOINED)
public class Administrador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2573329770323996902L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAdministrador", nullable=false)
	private int idAdministrador;
	
	@Column(name = "nombre", length = 30, nullable=false)
	private String nombre;

	@Column(name = "correo",length = 30, nullable=false)
	private String correo;
	
	@Column(name = "contrasena",length = 10, nullable=false)
	private String contrasena;
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
