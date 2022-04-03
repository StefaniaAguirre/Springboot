package com.startup.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.DTO.OfertaCliente;
import com.startup.app.DTO.OfertaHacedor;
import com.startup.app.entidades.Oferta;
import com.startup.app.repositorio.OfertaRepositorio;

@Service
public class OfertaServicioImpl implements OfertaServicio {

	@Autowired
	private OfertaRepositorio ofertaRepositorio;

	/**
	 * Metodo que busca una oferta por id
	 */
	@Override
	public Oferta encontrarOferta(int idOferta) {
		return ofertaRepositorio.findById(idOferta).get();
	}
	
	/**
	 * Metodo que busca una oferta por id
	 */
	@Override
	public Oferta guardarOferta(Oferta oferta) {
		return ofertaRepositorio.save(oferta);
	}

	@Override
	public Oferta listarOfertasHacedor(int idOferta) {
		// TODO Auto-generated method stub
		
		return ofertaRepositorio.findById(idOferta).get();
	}

	@Override
	public List<OfertaHacedor> listarOfertasDelHacedor(int idHacedor, int idTarea) {
		// TODO Auto-generated method stub

		
		List<Object[]> ofertas = ofertaRepositorio.listarOfertasDelHacedor(idHacedor, idTarea);
		
		List<OfertaHacedor> ofertasDelHacedor = new ArrayList<OfertaHacedor>();
		
		for (Object[] iterator : ofertas) {
			System.out.println("iterator datos :"+ iterator[0]);
			int idOferta = (int) iterator[0];
			String nombreTarea = (String) iterator[1];
			String notificacion =  (String) iterator[2];
			boolean esAceptada = (boolean) iterator[3]; 
			int tiempoVida = (int) iterator[4];
			double precioBase = (double)iterator[5];
			
			OfertaHacedor nuevaOferta = new OfertaHacedor(idOferta, nombreTarea, notificacion, esAceptada, tiempoVida, precioBase);
			ofertasDelHacedor.add(nuevaOferta);
		}
		return ofertasDelHacedor;
		
	}

	@Override
	public List<OfertaCliente> listarOfertasClientes(int idCliente) {
		// TODO Auto-generated method stub
		List<Object[]> ofertas = ofertaRepositorio.listarOfertasClientes(idCliente);
		
		List<OfertaCliente> ofertasDelCliente = new ArrayList<OfertaCliente>();
		
		for (Object[] iterator : ofertas) {
			int idServicio = (int) iterator[0];
			int idOferta = (int) iterator[1];
			String notificacion =  (String) iterator[2];
			boolean ofertaAceptada = (boolean) iterator[3]; 
			double precioBase = (double)iterator[4];
			
			OfertaCliente nuevaOferta = new OfertaCliente(idServicio, idOferta, notificacion, ofertaAceptada, precioBase);
			ofertasDelCliente.add(nuevaOferta);
		}
		return ofertasDelCliente;
	}


	/***
	 * Metodo que permite cambiar el estado de la oferta solicitada
	 * @param idOferta id de la oferta
	 * @param esAceptada estado de la oferta
	 */
//	public void AceptarRechazarOferta(int idOferta, boolean esAceptada) {
//		
//		//Obteniendo oferta
//		Oferta miOferta = ofertaRepositorio.findById(idOferta);
//		
//		//Cambiar el estado de la oferta (Aceptado o Rechazado)
//		miOferta.setEsAceptada(esAceptada);
//		
//		//Actualizar los datos de la oferta
//		ofertaRepositorio.save(miOferta);
//	}
}
