package com.startup.app.service;

import java.util.List;

import com.startup.app.DTO.DetallesHabilidadHacedor;
import com.startup.app.entidades.Cliente;
import com.startup.app.entidades.Hacedor;

public interface HacedorServicio {
	
	public Hacedor guardarHacedor(Hacedor hacedor);
	
	public Hacedor obtenerHacedor(int idHacedor);
	
	public List<DetallesHabilidadHacedor> listarDetalleHacedor(int idHacedor);
	
	public Hacedor loginHacedor(String correo, String contrasena);
	
	public Hacedor obtenerUltimoHacedor();
	
	public List<Hacedor> obtenerHacedores();
}
