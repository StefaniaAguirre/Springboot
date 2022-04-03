package com.startup.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.DTO.verificarServicio;
import com.startup.app.entidades.Servicio;
import com.startup.app.entidades.Tarea;
import com.startup.app.service.ServicioServicio;

@RestController
@RequestMapping("/api/servicio")
@CrossOrigin({ "*" })
public class ServicioControlador {

	@Autowired
	private ServicioServicio servicioServicio;

	// Peticion del metodo que Crear servicio
	@PostMapping
	public ResponseEntity<?> crearServicio(@RequestBody Servicio servicio) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicioServicio.crearServicio(servicio));
	}
	
	//Peticion del metodo que Lista Servicios para los que un hacedor cumple con las condiciones
	@GetMapping("/listarDetalleServicio/{idHacedor}&&{idTarea}")
	public ResponseEntity<?> listarDetalleServicio(@PathVariable int idHacedor, @PathVariable int idTarea){
	
		System.out.println("idHacedor : "+idHacedor);
	List<DetalleServicioAceptado> listaDetalleServicio = servicioServicio.listarDetalleServicio(idHacedor,idTarea);
		
		if(listaDetalleServicio == null) {
			return null;
		}
		return ResponseEntity.ok(listaDetalleServicio);
	}
	
	//Peticion que Lista el detalle del servicio Aceptado
	@GetMapping("/detalleServicioAceptado/{idServicio}")
	public ResponseEntity<?> detalleServicioAceptado(@PathVariable int idServicio) {
		
		List<String> DetalleServicioAceptado = servicioServicio.detalleServicioAceptado(idServicio);
		
		if(DetalleServicioAceptado == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(DetalleServicioAceptado);
	}
	
	//
	@GetMapping("/verificarServicio/{idTarea}")
	public ResponseEntity<?> verificarServicioSolicitado(@PathVariable int idTarea){
		
		List<verificarServicio> servicioSolicitado = servicioServicio.verificarServicioSolicitado(idTarea);
		if(servicioSolicitado == null) {
			return null;
		}
		return ResponseEntity.ok(servicioSolicitado);	
	}
}
