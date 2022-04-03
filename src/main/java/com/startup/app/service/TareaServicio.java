package com.startup.app.service;

import java.util.List;

import com.startup.app.entidades.Tarea;

public interface TareaServicio {

	public List<Tarea> listarTareas();
	
	public Tarea obtenerIdTarea(String nombreTarea);
}
