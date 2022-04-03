package com.startup.app.service;

import java.util.List;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.entidades.Servicio;

import com.startup.app.DTO.verificarServicio;

public interface ServicioServicio {
	
	public Servicio crearServicio(Servicio servicio);
	
	public List<DetalleServicioAceptado> listarDetalleServicio(int idHacedor, int idTarea);
	
	public List<String> detalleServicioAceptado(int idServicio);
	
	public List<verificarServicio> verificarServicioSolicitado(int idTarea);
}
