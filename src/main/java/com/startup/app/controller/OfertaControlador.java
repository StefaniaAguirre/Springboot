package com.startup.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.DTO.OfertaCliente;
import com.startup.app.DTO.OfertaHacedor;
import com.startup.app.entidades.Hacedor;
import com.startup.app.entidades.Oferta;
import com.startup.app.service.OfertaServicio;

@RestController
@RequestMapping("/api/oferta")
@CrossOrigin({"*"})
public class OfertaControlador {

	@Autowired
	public OfertaServicio ofertaServicio; 
	
	@PutMapping("/actualizar/{idOferta}&&{estado}")
	public ResponseEntity<?> AceptarRechazarOferta(@RequestBody Oferta oferta, @PathVariable int idOferta, @PathVariable boolean estado){
		
	
		Oferta ofertaEncontrada = ofertaServicio.encontrarOferta(idOferta);
		
		if(ofertaEncontrada == null) {
			
			return ResponseEntity.notFound().build();
		}
		ofertaEncontrada.setEsAceptada(estado);
		
		ofertaEncontrada = ofertaServicio.guardarOferta(ofertaEncontrada);
		
		return ResponseEntity.ok(ofertaEncontrada);
	}
	
	@GetMapping("/listarOfertaHacedor/{idOferta}")
	public ResponseEntity<?> listarOfertasHacedor(@PathVariable int idOferta){
	
	
	Oferta lista = ofertaServicio.listarOfertasHacedor(idOferta);
		
		if(lista == null ) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(lista);
	}

	@GetMapping("/listarOfertaCliente/{idCliente}")
	public ResponseEntity<?> listarOfertasCliente(@PathVariable int idCliente){
	
	
	List<OfertaCliente> lista = ofertaServicio.listarOfertasClientes(idCliente);
		
		if(lista == null ) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/listarOfertasDelHacedor/{idHacedor}&&{idTarea}")
	public ResponseEntity<?> listarOfertasHacedor(@PathVariable int idHacedor, @PathVariable int idTarea){
	
		List<OfertaHacedor> lista = ofertaServicio.listarOfertasDelHacedor(idHacedor, idTarea);
		
		if(lista == null ) {
			return null;
		}
		return ResponseEntity.ok(lista);
	}
	
	//Crear Oferta
		@PostMapping
		public ResponseEntity<?> guardarOferta(@RequestBody Oferta oferta){
			return ResponseEntity.status(HttpStatus.CREATED).body(ofertaServicio.guardarOferta(oferta));
		}
}


