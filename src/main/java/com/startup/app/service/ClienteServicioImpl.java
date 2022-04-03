package com.startup.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.DTO.ServicioCreadoCliente;
import com.startup.app.entidades.Cliente;
import com.startup.app.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	/**
	 * Método para registrar Cliente
	 */
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		
		return clienteRepositorio.save(cliente);
	}
	
	/**
	 * metodo que obtiene los servicios solicitados por el cliente
	 */
	@Override
	public List<ServicioCreadoCliente> obtenerservicioCliente(int idCliente){
		
		List<Object[]> serviciosCliente = clienteRepositorio.obtenerservicioCliente(idCliente);
		
		List<ServicioCreadoCliente> serviciosCreadosCliente = new ArrayList<ServicioCreadoCliente>();
		
		for (Object[] iterator : serviciosCliente) {
			
			String nombreTarea = (String) iterator[0];
			String descripcion = (String) iterator[1];
			double precioServicio = (double)iterator[2];
			System.out.println(iterator[3]);
			boolean pagoRealizado =  (iterator[3].equals("false")) ? false : true;
			boolean tareaTerminada =  (iterator[3].equals("false")) ? false : true;
			boolean esAceptada=  (iterator[3].equals("false")) ? false : true;
			
			ServicioCreadoCliente  nuevoServicio = new ServicioCreadoCliente(nombreTarea, descripcion, precioServicio, pagoRealizado, tareaTerminada, esAceptada);
			serviciosCreadosCliente.add(nuevoServicio);

		}
		return serviciosCreadosCliente;
	}

	/**
	 * metodo para obtener el cliente que inicia sesion
	 */
	@Override
	public Cliente loginCliente(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return clienteRepositorio.loginCliente(correo, contrasena);
	}

	@Override
	public Cliente obtenerCliente(int idCliente) {
		// TODO Auto-generated method stub
		return clienteRepositorio.findById(idCliente).get();
	}

	@Override
	public Cliente obtenerUltimoCliente() {
		// TODO Auto-generated method stub
		 int idCliente = clienteRepositorio.obtenerUltimoCliente();
	
		return obtenerCliente(idCliente);
	}
	
	
}
