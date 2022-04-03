package com.startup.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.DTO.DetallesHabilidadHacedor;
import com.startup.app.entidades.Cliente;
import com.startup.app.entidades.Hacedor;
import com.startup.app.repositorio.HacedorRepositorio;

@Service
public class HacedorServicioImpl implements HacedorServicio {

	@Autowired
	private HacedorRepositorio hacedorRepositorio;
	
	/**
	 * Metodo para registrar Hacedor
	 */
	@Override
	public Hacedor guardarHacedor(Hacedor hacedor) {
		// TODO Auto-generated method stub
		return hacedorRepositorio.save(hacedor);
	}

	/**
	 * Metodo para listar los detaller del hacedor 
	 */
	@Override
	public List<DetallesHabilidadHacedor> listarDetalleHacedor(int idHacedor) {
		// TODO Auto-generated method stub
		List<Object[]> detalles = hacedorRepositorio.listarDetalleHacedor(idHacedor);
		
		List<DetallesHabilidadHacedor> detallesHacedor = new ArrayList<DetallesHabilidadHacedor>();
		
		for (Object[] iterator :  detalles) {
			 String nombre = (String) iterator[0] ;
			int edad = (int)iterator[1] ;
			String nombreTarea =(String) iterator[2] ;
			String definicion =(String) iterator[3] ;
			double precio = (double)iterator[4] ;	
			int idTarea = (int) iterator[5];
			
			DetallesHabilidadHacedor nuedoDetalleHacedor = new DetallesHabilidadHacedor(nombre, edad, nombreTarea, definicion, precio, idTarea);
			detallesHacedor.add(nuedoDetalleHacedor);
		}
				
		return detallesHacedor;
	}

	@Override
	public Hacedor loginHacedor(String correo, String contrasena) {
		// TODO Auto-generated method stub
		return hacedorRepositorio.loginHacedor(correo, contrasena);
	}
	
	//obtener los datos del hacedor por id
	@Override
	public Hacedor obtenerHacedor(int idHacedor) 
	{
		return hacedorRepositorio.findById(idHacedor).get();
	}

	@Override
	public Hacedor obtenerUltimoHacedor() {
		// TODO Auto-generated method stub
		int idHacedor = hacedorRepositorio.obtenerUltimoHacedor();
		
		return obtenerHacedor(idHacedor);
	}

	@Override
	public List<Hacedor> obtenerHacedores() {
		// TODO Auto-generated method stub
		return hacedorRepositorio.findAll();
	}
	

}
