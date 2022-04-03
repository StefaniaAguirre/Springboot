package com.startup.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.Administrador;
import com.startup.app.repositorio.AdministradorRepositorio;

@Service
public class AdministradorServicioImpl implements AdministradorServicio {

	@Autowired
	private AdministradorRepositorio administradorRepositorio;
	
	/**
	 * metodo que permite traer la información del administrador
	 */
	@Override
	public Administrador loginAdministrador(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return administradorRepositorio.loginAdministrador(correo, contrasena);
	}

}
