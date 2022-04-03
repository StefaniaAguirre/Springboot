package com.startup.app.service;

import com.startup.app.entidades.Administrador;

public interface AdministradorServicio {

	public Administrador loginAdministrador(String correo, String contrasena);
}
