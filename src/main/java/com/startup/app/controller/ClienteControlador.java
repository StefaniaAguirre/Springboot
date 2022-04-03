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

import com.startup.app.DTO.ServicioCreadoCliente;
import com.startup.app.entidades.Cliente;
import com.startup.app.entidades.Hacedor;
import com.startup.app.service.ClienteServicio;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin({"*"})
public class ClienteControlador {

	@Autowired
	public ClienteServicio clienteServicio;
	
	//Crear cliente 
	@PostMapping
	public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteServicio.guardarCliente(cliente));
		
	}
	
	//obtener servicios creados por el cliente
	@GetMapping("/serviciosCliente/{idCliente}")
	public ResponseEntity<?> obtenerservicioCliente(@PathVariable int idCliente){
	
		List<ServicioCreadoCliente> serviciosCliente = clienteServicio.obtenerservicioCliente(idCliente);
			
		if(serviciosCliente == null) {
			//ResponseEntity.notFound().build();
			return null; 
		}
			
		return ResponseEntity.ok(serviciosCliente);
	}
		
	//obtener cliente logueado
	@GetMapping("/loginCliente/{correo}&&{contrasena}")
	public ResponseEntity<?> loginCliente(@PathVariable String correo, @PathVariable String contrasena){
		System.out.println(correo +" : "+ contrasena);
		Cliente cliente = clienteServicio.loginCliente(correo, contrasena);
		
		if(cliente == null) {
			//ResponseEntity.notFound().build();
			return null; 
		}
		
		return ResponseEntity.ok(cliente);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> obtenerHacedor(@PathVariable(value = "id") int idCliente){
		Cliente cliente = clienteServicio.obtenerCliente(idCliente);
		
		if(cliente == null) {
			return null;
		}
		return ResponseEntity.ok(cliente); 
	}
	
	@GetMapping("/ultimoCliente")
	public ResponseEntity<?> obtenerUltimoCliente(){
		Cliente cliente = clienteServicio.obtenerUltimoCliente();
		
		if(cliente == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cliente); 
	}
	
}
