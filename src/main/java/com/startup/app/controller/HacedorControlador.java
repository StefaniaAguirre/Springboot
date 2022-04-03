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

import com.startup.app.DTO.DetallesHabilidadHacedor;
import com.startup.app.entidades.Hacedor;
import com.startup.app.service.HacedorServicio;

@RestController
@RequestMapping("/api/hacedor")
@CrossOrigin({"*"})
public class HacedorControlador {

	@Autowired
	public HacedorServicio hacedorServicio;
	
	//Crear hacedor 
	@PostMapping
	public ResponseEntity<?> guardarHacedor(@RequestBody Hacedor hacedor){
		return ResponseEntity.status(HttpStatus.CREATED).body(hacedorServicio.guardarHacedor(hacedor));
	}
	
	//Listar detalles del perfil hacedor 
	@GetMapping("/listarDetalle/{idHacedor}")
	public ResponseEntity<?> listarDetalleHacedor(@PathVariable int idHacedor){
		
		List<DetallesHabilidadHacedor> listaDetalles = hacedorServicio.listarDetalleHacedor(idHacedor);
		
		if(listaDetalles.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(listaDetalles);
		//return ResponseEntity.ok(hacedorServicio.listarDetalleHacedor(idHacedor));
	}
	
	
	@GetMapping("/loginHacedor/{correo}&&{contrasena}")
	public ResponseEntity<?> loginHacedor(@PathVariable String correo, @PathVariable String contrasena){
		Hacedor hacedor = hacedorServicio.loginHacedor(correo, contrasena);
		
		if(hacedor == null) {
			//ResponseEntity.notFound().build()
			return null;
		}
		
		return ResponseEntity.ok(hacedor);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> obtenerHacedor(@PathVariable(value = "id") int idHacedor){
		Hacedor oHacedor = hacedorServicio.obtenerHacedor(idHacedor);
		
		if(oHacedor == null) {
			return null;
		}
		return ResponseEntity.ok(oHacedor); 
	}
	
	@GetMapping("/ultimoHacedor")
	public ResponseEntity<?> obtenerUltimoHacedor(){
		Hacedor hacedor = hacedorServicio.obtenerUltimoHacedor();
		
		if(hacedor == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(hacedor); 
	}
	
	@GetMapping("/listarHacedores")
	public ResponseEntity<?> obtenerHacedores(){
		List<Hacedor> hacedores = hacedorServicio.obtenerHacedores();
		
		if(hacedores == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(hacedores); 
	}
	

	
}
