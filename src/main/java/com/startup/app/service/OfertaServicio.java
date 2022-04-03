package com.startup.app.service;

import java.util.List;

import com.startup.app.DTO.OfertaCliente;
import com.startup.app.DTO.OfertaHacedor;
import com.startup.app.entidades.Oferta;

public interface OfertaServicio {
	
	/**
	 * 
	 * @param idOferta
	 * @return
	 */
	public Oferta encontrarOferta(int idOferta);
	
	public List<OfertaCliente> listarOfertasClientes(int idCliente);

	/**
	 * Metodo que busca una oferta por id
	 */
	public Oferta guardarOferta(Oferta oferta);
	
	/**
	 * 
	 * @param idOferta
	 * @return
	 */
	public Oferta listarOfertasHacedor(int idOferta);
	
	
	public List<OfertaHacedor> listarOfertasDelHacedor(int idHacedor, int idTarea);
}
