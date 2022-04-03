package com.startup.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.service.AdministradorServicio;

@RestController
@RequestMapping("/api/administrador")
@CrossOrigin({"*"})
public class AdministradorControlador {

	@Autowired
	public AdministradorServicio administradorServicio;
	
	//obtener cliente logueado
		@GetMapping("/loginAdministrador/{correo}&&{contrasena}")
		public ResponseEntity<?> loginAdministrador(@PathVariable String correo, @PathVariable String contrasena){
			return ResponseEntity.ok(administradorServicio.loginAdministrador(correo, contrasena));
		}
}
