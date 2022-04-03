package com.startup.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.DTO.verificarServicio;
import com.startup.app.entidades.Servicio;
import com.startup.app.repositorio.ServicioRepositorio;

@Service
public class ServicioServicioImpl implements ServicioServicio {

	@Autowired
	private ServicioRepositorio servicioRepositorio;

	/**
	 * implementación del Metodo para crear servicio
	 */
	@Override
	public Servicio crearServicio(Servicio servicio) {
		return servicioRepositorio.save(servicio);
	}
	

	/**
	 * implementación del metodo que lista las solicitudes de servicios para las que un hacedor cumple las condiciones
	 */
	@Override
	public List<DetalleServicioAceptado> listarDetalleServicio(int idHacedor, int idTarea) {
		
		List<Object[]> servicioAceptado = servicioRepositorio.listarDetalleServicio(idHacedor, idTarea);
		
		List<DetalleServicioAceptado> detalleServicioAceptado = new ArrayList<DetalleServicioAceptado>();
		
		for (Object[] iterator : servicioAceptado) {
			String nombre = (String) iterator[0] ;
			int item = (int) iterator[1] ;
			double precioServicio = (double)iterator[2] ;
			String nombreTarea =  (String) iterator[3] ;
			String descripcion = (String) iterator[4]; 
			
			DetalleServicioAceptado nuevoServicioAceptado = new DetalleServicioAceptado(nombre,item, precioServicio ,nombreTarea, descripcion);
			
			detalleServicioAceptado.add(nuevoServicioAceptado);
		}
		return detalleServicioAceptado;
		
	} 

	/**
	 * Implementación del metodo que lista el detalle del servicio Aceptado
	 */
	@Override
	public List<String> detalleServicioAceptado(int idServicio) {
		// TODO Auto-generated method stub
		
		return servicioRepositorio.detalleServicioAceptado(idServicio);
	}


	@Override
	public List<verificarServicio> verificarServicioSolicitado(int idTarea) {
		// TODO Auto-generated method stub
		List<Object[]>  servicio = servicioRepositorio.verificarServicioSolicitado(idTarea);
		
		List<verificarServicio> servicioVerficado = new ArrayList<verificarServicio>();
		System.out.println("servicio:"+ servicio);
		for (Object[] iterator : servicio) {
			int idHacedor = (int) iterator[0];
			double precioHabilidad = (double) iterator[1];
			
			verificarServicio servicioV = new verificarServicio(precioHabilidad, idHacedor);
			
			servicioVerficado.add(servicioV);
			
		}
		return servicioVerficado ;
	}

}
