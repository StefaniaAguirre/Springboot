package com.startup.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.HabilidadHacedor;
import com.startup.app.repositorio.HabilidadHacedorRepositorio;

@Service
public class HabilidadHacedorServicioImpl implements HabilidadHacedorServicio {

	@Autowired
	private HabilidadHacedorRepositorio habilidadHacedorRepositorio;
	
	/**
	 * Metodo para crear una habilidad del hacedor
	 */
	@Override
	public HabilidadHacedor crearHabilidadHacedor(HabilidadHacedor habilidadHacedor) {
		return habilidadHacedorRepositorio.save(habilidadHacedor);
	}
}
