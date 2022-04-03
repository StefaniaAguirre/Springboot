package com.startup.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.Tarea;
import com.startup.app.repositorio.TareaRepositorio;

@Service
public class TareaServicioImpl implements TareaServicio {

	@Autowired 
	private TareaRepositorio tareaRepositorio;
	
	/**
	 * Consultar servicios que se pueden solicitar
	 */
	@Override
	public List<Tarea> listarTareas() {
		return tareaRepositorio.findAll();
	}

	@Override
	public Tarea obtenerIdTarea(String nombreTarea) {
		// TODO Auto-generated method stub
		return tareaRepositorio.obtenerIdTarea(nombreTarea);
	}
	
	
}
