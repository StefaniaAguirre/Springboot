package com.startup.app.entidades;

import java.io.Serializable;
import java.util.ArrayList;

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
@Table(name = "hacedor")
@Inheritance(strategy = InheritanceType.JOINED)
public class Hacedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8998767011586811807L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHacedor", nullable=false)
	private int idHacedor;
	
	@Column(name = "nombre", length = 30, nullable=false)
	private String nombre;
	
	@Column(name = "telefono",length = 45, nullable=false)
	private String telefono;
	
	@Column(name = "direccion",length = 30, nullable=false)
	private String direccion;
	
	@Column(name = "correo",length = 45, nullable=false)
	private String correo;
	
	@Column(name = "contrasena",length = 10, nullable=false)
	private String contrasena;
	
	@Column(name = "edad", nullable=false)
	private int edad;
	
	@ManyToOne
	@JoinColumn(name = "idOferta", referencedColumnName = "idOferta")
	private Oferta idOferta;

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdHacedor() {
		return idHacedor;
	}
	public void setIdHacedor(int idHacedor) {
		this.idHacedor = idHacedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Oferta getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(Oferta idOferta) {
		this.idOferta = idOferta;
	}
	
}
