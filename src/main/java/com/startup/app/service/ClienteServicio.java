package com.startup.app.service;

import java.util.List;

import com.startup.app.DTO.ServicioCreadoCliente;
import com.startup.app.entidades.Cliente;

public interface ClienteServicio {

	public Cliente guardarCliente(Cliente cliente);
	
	public Cliente loginCliente(String correo, String contrasena);
	
	public Cliente obtenerCliente(int idCliente);
	
	public List<ServicioCreadoCliente> obtenerservicioCliente(int idCliente);
	
	public Cliente obtenerUltimoCliente();
}
